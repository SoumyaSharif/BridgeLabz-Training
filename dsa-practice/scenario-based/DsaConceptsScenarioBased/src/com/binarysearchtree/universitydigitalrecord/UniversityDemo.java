package com.binarysearchtree.universitydigitalrecord;

public class UniversityDemo
{
	    public static void main(String[] args) {
	        UniversityBST bst = new UniversityBST();
	
	        // Insertion
	        bst.root = bst.insert(bst.root, 105, "Aarav");
	        bst.root = bst.insert(bst.root, 102, "Neha");
	        bst.root = bst.insert(bst.root, 110, "Rohan");
	        bst.root = bst.insert(bst.root, 101, "Isha");
	        bst.root = bst.insert(bst.root, 108, "Kabir");
	
	        // Display sorted roll numbers
	        System.out.println("Sorted Student Records:");
	        bst.inorder(bst.root);
	
	        // Search
	        System.out.println("\nSearching for roll no 102:");
	        StudentNode result = bst.search(bst.root, 102);
	        if (result != null)
	            System.out.println("Found: " + result.name);
	        else
	            System.out.println("Student not found");
	
	        // Delete
	        System.out.println("\nDeleting roll no 105...");
	        bst.root = bst.delete(bst.root, 105);
	
	        System.out.println("\nUpdated Student Records:");
	        bst.inorder(bst.root);
	    }
	}
	

