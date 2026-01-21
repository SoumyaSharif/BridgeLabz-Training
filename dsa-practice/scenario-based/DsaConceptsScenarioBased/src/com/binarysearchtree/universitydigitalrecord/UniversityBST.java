package com.binarysearchtree.universitydigitalrecord;
public class UniversityBST {

    StudentNode root;

    // 🔹 Scenario 1: Insert student
    public StudentNode insert(StudentNode root, int rollNo, String name) {
        if (root == null) {
            return new StudentNode(rollNo, name);
        }

        if (rollNo < root.rollNo) {
            root.left = insert(root.left, rollNo, name);
        } else if (rollNo > root.rollNo) {
            root.right = insert(root.right, rollNo, name);
        }

        return root;
    }

    // 🔹 Scenario 2: Delete student
    public StudentNode delete(StudentNode root, int rollNo) {
        if (root == null) return null;

        if (rollNo < root.rollNo) {
            root.left = delete(root.left, rollNo);
        } else if (rollNo > root.rollNo) {
            root.right = delete(root.right, rollNo);
        } else {
            // Case 1: No child
            if (root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            // Case 3: Two children
            StudentNode successor = findMin(root.right);
            root.rollNo = successor.rollNo;
            root.name = successor.name;
            root.right = delete(root.right, successor.rollNo);
        }
        return root;
    }

    private StudentNode findMin(StudentNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // 🔹 Scenario 3a: Search student
    public StudentNode search(StudentNode root, int rollNo) {
        if (root == null || root.rollNo == rollNo)
            return root;

        if (rollNo < root.rollNo)
            return search(root.left, rollNo);

        return search(root.right, rollNo);
    }

    // 🔹 Scenario 3b: Display sorted roll numbers
    public void inorder(StudentNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Roll No: " + root.rollNo + ", Name: " + root.name);
            inorder(root.right);
        }
    }
    }
