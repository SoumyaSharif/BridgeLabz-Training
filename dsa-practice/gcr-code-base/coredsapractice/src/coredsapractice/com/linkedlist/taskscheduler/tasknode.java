package coredsapractice.com.linkedlist.taskscheduler;

class tasknode {
    int id, priority;
    String name, due;
    tasknode next;

    tasknode(int i, String n, int p, String d) {
        id = i; name = n; priority = p; due = d;
    }
}