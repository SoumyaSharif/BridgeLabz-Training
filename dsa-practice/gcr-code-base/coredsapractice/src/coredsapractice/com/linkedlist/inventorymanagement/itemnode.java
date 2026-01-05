package coredsapractice.com.linkedlist.inventorymanagement;

class itemnode {
    int id, qty;
    String name;
    double price;
    itemnode next;

    itemnode(int i, String n, int q, double p) {
        id = i; name = n; qty = q; price = p;
    }
}