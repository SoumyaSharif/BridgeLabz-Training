package coredsapractice.com.linkedlist.studentrecord;

class studentlist {
    studentnode head;

    void addFirst(studentnode n) {
        n.next = head;
        head = n;
    }

    void addLast(studentnode n) {
        if (head == null) { head = n; return; }
        studentnode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = n;
    }

    void deleteByRoll(int roll) {
        if (head == null) return;
        if (head.roll == roll) { head = head.next; return; }

        studentnode temp = head;
        while (temp.next != null && temp.next.roll != roll)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    void updateGrade(int roll, String newGrade) {
        studentnode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    void display() {
        studentnode temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.grade);
            temp = temp.next;
        }
    }
}