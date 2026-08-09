package week1.day3.hackerrankquestions;

public class PrintElementsOfLinkedList {

    // Node class
    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        SinglyLinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to print the linked list
    public static void printLinkedList(SinglyLinkedListNode head) {

        SinglyLinkedListNode current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {

        // Hard-coded linked list
        SinglyLinkedListNode head = new SinglyLinkedListNode(16);

        head.next = new SinglyLinkedListNode(13);

        // Call the function
        printLinkedList(head);
    }
}
