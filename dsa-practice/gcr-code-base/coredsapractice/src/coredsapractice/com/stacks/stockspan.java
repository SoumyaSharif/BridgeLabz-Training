package coredsapractice.com.stacks;

import java.util.Stack;

class stockspan {

    static void calculateSpan(int[] price) {
        Stack<Integer> st = new Stack<>();
        int[] span = new int[price.length];

        for (int i = 0; i < price.length; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i])
                st.pop();

            span[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }

        for (int s : span)
            System.out.print(s + " ");
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        calculateSpan(prices);
    }
}

