package coredsapractice.com.linkedlist.taskscheduler;

class tasklist {
    tasknode head = null;

    void addTask(tasknode n) {
        if (head == null) {
            head = n;
            n.next = head;
            return;
        }
        tasknode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = n;
        n.next = head;
    }

    void display() {
        if (head == null) return;
        tasknode temp = head;
        do {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }
}
