package com.StacksQueues.StackQuestions.QueueUsingStack;

import java.util.Stack;

public class QueueUsingTwoStack_II {
    Stack<Integer> st1;
    Stack<Integer> st2;

    public QueueUsingTwoStack_II() {
        this.st1 = new Stack<>();
        this.st2 = new Stack<>();
    }


    public boolean add(int val) {
        st1.push(val);
        return  true;
    }
    // making the remove operation costly
    public int remove() {
        if (st1.isEmpty() && st2.isEmpty()) {
            System.out.println("Nothing to remove");
            return -1;
        }

        if (st2.isEmpty()) {
            while( !st1.isEmpty()) {
                st2.push(st1.peek());
                st1.pop();
            }
        }

//        int removed = st2.peek();
//        st2.pop();
//        return removed;

        return st2.pop();
    }

    public void display() {
        if (st2.isEmpty()) {
            printStack01();
            System.out.print("END");
            return;
        }

        int value = st2.pop();
        System.out.print(value + " <- ");
        display();
        st2.push(value);
    }

    public void printStack01() {
        if (st1.isEmpty()) {
            return ;
        }
        int value = st1.pop();
        printStack01();
        System.out.print(value + " <- ");
        st1.push(value);
    }

    public int size() {
        return st1.size()  + st2.size();
    }

    public boolean isEmpty() {
        return st1.isEmpty() && st2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStack_II queue = new QueueUsingTwoStack_II();
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
