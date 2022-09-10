package com.StacksQueues.QueueQuestions.StackUsingQueue;

//Q. https://practice.geeksforgeeks.org/problems/stack-using-two-queues/1

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue_I {
    private Queue<Integer> queue1 ;
    private Queue<Integer> queue2 ;

    public StackUsingTwoQueue_I() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
    }

    public boolean push(int val) {
        queue1.add(val);
        while (!queue2.isEmpty()) {
            queue1.add(queue2.peek());
            queue2.remove();
        }

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return true;
    }

    public int pop() {
        return queue2.remove();
    }

    public boolean isEmpty() {
        return queue2.isEmpty();
    }
    public int size() {
        return queue2.size();
    }

    public static void main(String[] args) {
        StackUsingTwoQueue_I stack = new StackUsingTwoQueue_I();
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
