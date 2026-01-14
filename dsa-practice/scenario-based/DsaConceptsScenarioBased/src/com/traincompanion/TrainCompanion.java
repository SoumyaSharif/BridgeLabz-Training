package com.traincompanion;
public class TrainCompanion {

    private CompartmentNode head;
    private CompartmentNode tail;

    // Add compartment at end
    public void addCompartment(String name) {
        CompartmentNode node = new CompartmentNode(name);

        if (head == null) {
            head = tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    // Remove compartment
    public void removeCompartment(String name) {
        CompartmentNode temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                System.out.println("Removed compartment: " + name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found.");
    }

    // Traverse forward
    public void traverseForward() {
        CompartmentNode temp = head;
        System.out.println("Forward traversal:");

        while (temp != null) {
            System.out.print(temp.name + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Traverse backward
    public void traverseBackward() {
        CompartmentNode temp = tail;
        System.out.println("Backward traversal:");

        while (temp != null) {
            System.out.print(temp.name + " <-> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    // Show adjacent compartments
    public void showAdjacent(String name) {
        CompartmentNode temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println("\nCurrent: " + temp.name);
                System.out.println("Previous: " +
                        (temp.prev != null ? temp.prev.name : "None"));
                System.out.println("Next: " +
                        (temp.next != null ? temp.next.name : "None"));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found.");
    }
}
