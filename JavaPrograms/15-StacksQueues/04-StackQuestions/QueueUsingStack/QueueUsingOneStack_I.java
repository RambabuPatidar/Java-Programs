package com.StacksQueues.StackQuestions.QueueUsingStack;

import java.util.Stack;
// this uses the temporary stack in this question
// we will also do which will have single stack with no temporary stack
// Spoiler : That will also have two stacks but the one will be hidden.

public class QueueUsingOneStack_I {
    private Stack<Integer> stack;

    public QueueUsingOneStack_I() {
        this.stack = new Stack<>();
    }

    public boolean add(int val ) {
        stack.push(val);
        return true;
    }
    // making remove operation costly
    public int remove() {
        if (stack.isEmpty()) {
            System.out.println("Nothing to remove");
            return -1;
        }
        // putting all the element in the another stack
        Stack<Integer> temp = new Stack<>();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            temp.push(stack.peek());
            stack.pop();
        }

        // removing the first item inserted
        int removed = temp.peek();
        temp.pop();

        // putting back all the remaining item in stack
        for (int i = 0; i < size - 1; i++) {
            stack.push(temp.peek());
            temp.pop();
        }
        return removed;
    }

    public void display() {
        Stack<Integer> temp = new Stack<>();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            temp.push(stack.peek());
            stack.pop();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(temp.peek() + " <- ");
            temp.pop();
        }
        System.out.println(" END ");
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingOneStack_I queue = new QueueUsingOneStack_I();
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
