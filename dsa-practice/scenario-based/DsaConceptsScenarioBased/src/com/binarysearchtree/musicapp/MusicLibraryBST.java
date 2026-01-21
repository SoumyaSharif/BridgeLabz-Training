package com.binarysearchtree.musicapp;
public class MusicLibraryBST {

    Song root;

    // 🔹 Scenario 2: Insert new track
    Song insert(Song root, int trackId, String title) {
        if (root == null)
            return new Song(trackId, title);

        if (trackId < root.trackId)
            root.left = insert(root.left, trackId, title);
        else if (trackId > root.trackId)
            root.right = insert(root.right, trackId, title);

        return root;
    }

    // 🔹 Scenario 1: Search track by ID
    Song search(Song root, int trackId) {
        if (root == null || root.trackId == trackId)
            return root;

        if (trackId < root.trackId)
            return search(root.left, trackId);

        return search(root.right, trackId);
    }

    // 🔹 Scenario 3: Display playlist (Inorder)
    void inorder(Song root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Track ID: " + root.trackId + ", Title: " + root.title);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        MusicLibraryBST library = new MusicLibraryBST();

        library.root = library.insert(library.root, 15, "Zara Zara");
        library.root = library.insert(library.root, 10, "Apna Bana Le");
        library.root = library.insert(library.root, 20, "Kesariya");

        System.out.println("Playlist:");
        library.inorder(library.root);

        System.out.println("\nSearching Track ID 10:");
        Song song = library.search(library.root, 10);
        if (song != null)
            System.out.println("Found: " + song.title);
    }
}
