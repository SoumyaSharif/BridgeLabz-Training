package coredsapractice.com.stacks;

import java.util.Stack;

class sortstack {

    static void sort(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sort(s);
            insertSorted(s, x);
        }
    }

    static void insertSorted(Stack<Integer> s, int x) {
        if (s.isEmpty() || s.peek() <= x) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        insertSorted(s, x);
        s.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(10);
        s.push(20);

        sort(s);

        while (!s.isEmpty())
            System.out.println(s.pop());
    }
}

