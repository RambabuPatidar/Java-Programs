package com.StacksQueues.QueueQuestions.StackUsingQueue;

//Q. https://practice.geeksforgeeks.org/problems/stack-using-two-queues/1

import java.util.LinkedList;
import java.util.Queue;

// In this method I made Pop operation costly and the push operation is easy.
public class StackUsingTwoQueue_II {
    private Queue<Integer> queue1 ;
    private Queue<Integer> queue2 ;

    public StackUsingTwoQueue_II() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
    }

    public boolean push(int val) {
       queue1.add(val);
       return true;
    }

    public int pop() throws Exception
    {
        if (queue1.isEmpty()) {
            throw new Exception("Stack is empty");
        }
        while (queue1.size() != 1) {
            queue2.add(queue1.peek());
            queue1.remove();
        }
        int removed = queue1.remove();

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return removed;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }
    public int size() {
        return queue1.size();
    }

    public static void main(String[] args) throws Exception {
        StackUsingTwoQueue_II stack = new StackUsingTwoQueue_II();
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
