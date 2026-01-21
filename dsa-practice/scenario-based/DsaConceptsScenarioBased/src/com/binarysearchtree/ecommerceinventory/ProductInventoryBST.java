package com.binarysearchtree.ecommerceinventory;
public class ProductInventoryBST {

    Product root;

    // Insert product
    Product insert(Product root, int sku, String name, double price) {
        if (root == null)
            return new Product(sku, name, price);

        if (sku < root.sku)
            root.left = insert(root.left, sku, name, price);
        else if (sku > root.sku)
            root.right = insert(root.right, sku, name, price);

        return root;
    }

    // 🔹 Scenario 1: Lookup
    Product search(Product root, int sku) {
        if (root == null || root.sku == sku)
            return root;

        if (sku < root.sku)
            return search(root.left, sku);

        return search(root.right, sku);
    }

    // 🔹 Scenario 2: Price Update
    void updatePrice(int sku, double newPrice) {
        Product product = search(root, sku);
        if (product != null)
            product.price = newPrice;
    }

    // 🔹 Scenario 3: Sorted list by SKU
    void inorder(Product root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("SKU: " + root.sku + ", Name: " + root.name + ", Price: ₹" + root.price);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        ProductInventoryBST store = new ProductInventoryBST();

        store.root = store.insert(store.root, 2003, "Keyboard", 1500);
        store.root = store.insert(store.root, 2001, "Mouse", 800);
        store.root = store.insert(store.root, 2005, "Monitor", 12000);

        System.out.println("Sorted Product List:");
        store.inorder(store.root);

        System.out.println("\nUpdating price of SKU 2001...");
        store.updatePrice(2001, 750);

        System.out.println("\nAfter Update:");
        store.inorder(store.root);
    }
}
