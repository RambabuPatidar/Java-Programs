package com.StacksQueues.QueueQuestions.StackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue_I {
    Queue<Integer> queue;

    public StackUsingOneQueue_I() {
        this.queue =  new LinkedList<>();
    }

    public boolean push(int value) {
        queue.add(value);
        return true;
    }

    public int pop() throws Exception {
        int size = queue.size();
        if ( size == 0 ) {
            throw new Exception("Nothing to pop");
        }
        return helper(size);
    }

    private int helper(int size) throws Exception {
        if (size == 1) {
            return queue.remove();
        }

        int value = queue.peek();
        queue.remove();
        queue.add(value);

        return helper(size - 1);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public int size() {
        return queue.size();
    }

    public static void main(String[] args) throws Exception {
        StackUsingOneQueue_I stack = new StackUsingOneQueue_I();

        stack.push(2);
        stack.push(5);
        stack.push(87);

        System.out.println(stack.pop());
        stack.push(34);
        stack.push(98);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
