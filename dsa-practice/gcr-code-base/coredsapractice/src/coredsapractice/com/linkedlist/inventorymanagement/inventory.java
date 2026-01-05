package coredsapractice.com.linkedlist.inventorymanagement;

class inventory {
    itemnode head;

    void add(itemnode n) {
        n.next = head;
        head = n;
    }

    double totalValue() {
        double sum = 0;
        itemnode t = head;
        while (t != null) {
            sum += t.qty * t.price;
            t = t.next;
        }
        return sum;
    }
}