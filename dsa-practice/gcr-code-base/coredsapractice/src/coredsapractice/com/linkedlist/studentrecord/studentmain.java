package coredsapractice.com.linkedlist.studentrecord;

class studentmain {
    public static void main(String[] args) {

        studentlist list = new studentlist();

        list.addFirst(new studentnode(1, "Aman", 20, "A"));
        list.addLast(new studentnode(2, "Riya", 21, "B"));
        list.addLast(new studentnode(3, "Neha", 19, "A"));

        System.out.println("All Students:");
        list.display();

        System.out.println("\nUpdate Grade:");
        list.updateGrade(2, "A+");
        list.display();

        System.out.println("\nDelete Roll 1:");
        list.deleteByRoll(1);
        list.display();
    }
}
