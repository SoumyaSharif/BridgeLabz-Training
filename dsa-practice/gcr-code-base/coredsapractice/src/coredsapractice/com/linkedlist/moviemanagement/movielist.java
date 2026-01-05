package coredsapractice.com.linkedlist.moviemanagement;

class movielist {
    movienode head, tail;

    void addLast(movienode n) {
        if (head == null) {
            head = tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    void removeByTitle(String title) {
        movienode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;

                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        movienode t = head;
        while (t != null) {
            System.out.println(t.title + " " + t.rating);
            t = t.next;
        }
    }

    void displayReverse() {
        movienode t = tail;
        while (t != null) {
            System.out.println(t.title + " " + t.rating);
            t = t.prev;
        }
    }
}