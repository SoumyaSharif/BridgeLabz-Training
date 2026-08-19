package week1.day3.hackerrankquestions;

class Node {
    public Node next;
    int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}