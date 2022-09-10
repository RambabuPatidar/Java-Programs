package com.StacksQueues.StackQuestions.QueueUsingStack;

import java.util.Stack;

public class QueueUsingTwoStack_I {
    Stack<Integer> st1;
    Stack<Integer> st2;

    public QueueUsingTwoStack_I() {
        this.st1 = new Stack<>();
        this.st2 = new Stack<>();
    }

    // making the push operation costly
    public boolean add(int val) {
        // store all the element in to second stack
        while (!st1.isEmpty()) {
            st2.push(st1.peek());
            st1.pop();
        }
        // push the element in the empty stack
        st1.push(val);
        // again put all the element in the stack above the pushed element
        while(!st2.isEmpty()) {
            st1.push(st2.peek());
            st2.pop();
        }
        return true;
    }

    public int remove() {
        return st1.pop();
    }

    public void display() {
        if (st1.isEmpty()) {
            System.out.println("END");
            return;
        }

        int value = st1.pop();
        System.out.print(value + " <- ");
        display();
        st1.push(value);
    }

    public int size() {
        return st1.size();
    }

    public boolean isEmpty() {
        return st1.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStack_I queue = new QueueUsingTwoStack_I();
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
