package com.StacksQueues.StackQuestions.QueueUsingStack;

import java.util.Stack;

// this uses the temporary stack in this question
// we will also do which will have single stack with no temporary stack
// Spoiler : That will also have two stacks but the one will be hidden.

public class QueueUsingOneStack_II {
    private Stack<Integer> stack;

    public QueueUsingOneStack_II() {
        this.stack = new Stack<>();
    }

    // making add operation costly.
    public boolean add(int val ) {
        Stack<Integer> temp = new Stack<>();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            temp.push(stack.peek());
            stack.pop();
        }

        stack.push(val);

        // putting back all the remaining item in stack
        for (int i = 0; i < size; i++) {
            stack.push(temp.peek());
            temp.pop();
        }
        return true;
    }
    // making remove operation costly
    public int remove() {
        if (stack.isEmpty()) {
            System.out.println("Nothing to remove");
            return -1;
        }
        return stack.pop();
    }

    public void display() {
        if (stack.isEmpty()) {
            System.out.println("END");
            return;
        }

        int value = stack.pop();
        System.out.print(value + " <- ");
        display();
        stack.push(value);
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingOneStack_II queue = new QueueUsingOneStack_II();
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
