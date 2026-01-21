package com.binarysearchtree.musicapp;
class Song {
    int trackId;
    String title;
    Song left, right;

    Song(int trackId, String title) {
        this.trackId = trackId;
        this.title = title;
        left = right = null;
    }
}
