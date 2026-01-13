package com.ParcelTracker;

public class ParcelTracker {

    private StageNode head;

    // 1️⃣ Initialize default delivery stages
    public void initialize() {
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }

    // 2️⃣ Forward tracking through stages
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost! No tracking available.");
            return;
        }

        StageNode temp = head;
        while (temp != null) {
            System.out.print(temp.stage);
            if (temp.next != null) System.out.print(" → ");
            temp = temp.next;
        }
        System.out.println();
    }

    // 3️⃣ Add custom intermediate checkpoint
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null && !temp.stage.equals(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found. Cannot add checkpoint.");
            return;
        }

        StageNode newNode = new StageNode(newStage);
        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Checkpoint '" + newStage + "' added after '" + afterStage + "'");
    }

    // 4️⃣ Handle lost/missing parcel
    public void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as LOST.");
    }
}
