package com.StacksQueues.StackQuestions.QueueUsingStack;

import java.util.Stack;

public class QueueUsingStackRecursion {
    Stack<Integer> st;

    public QueueUsingStackRecursion() {
        this.st = new Stack<>();
    }

    // this will be simple
    public boolean add(int val) {
        st.push(val);
        return true;
    }

    public int remove() {
        // when there is only one element that element should be
        // removed and returned to print it.
        if (st.size() == 1) {
            return st.pop();
        }
        // empty the stack one by one
        int store = st.pop();
        int removed = remove();

        // pushing back the remaining item in the stack.
        st.push(store);
        return removed;
    }

    public boolean isEmpty() {
        return st.isEmpty();
    }

    public int size() {
        return st.size();
    }

    public void display() {
        helper();
        System.out.println("END");
    }

    private void helper() {
        if (st.isEmpty()) {
            return;
        }

        int store = st.pop();
        helper();
        System.out.print(store + " <- ");
        st.push(store);
    }

    public static void main(String[] args) {
        QueueUsingStackRecursion queue = new QueueUsingStackRecursion();
        queue.add(123);
        queue.add(34);
        queue.add(90);
        queue.add(76);
        queue.add(87);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.add(6);
        queue.add(7);

        queue.display();
    }
}
