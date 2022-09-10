package com.StacksQueues.QueueQuestions.StackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue_II {
    Queue<Integer> queue;

    public StackUsingOneQueue_II() {
        this.queue =  new LinkedList<>();
    }

    public boolean push(int value) {
        queue.add(value);
        int size = size();
        while( size != 1) {
            int val = queue.peek();
            queue.remove();
            queue.add(val);
            size--;
        }
        return true;
    }

    public int pop() throws Exception {
        if (queue.isEmpty()) {
            throw new Exception("Nothing to remove");
        }
        return queue.remove();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public int size() {
        return queue.size();
    }

    public static void main(String[] args) throws Exception {
        StackUsingOneQueue_II stack = new StackUsingOneQueue_II();

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
