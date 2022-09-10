package com.StacksQueues;

import java.util.*;

public class InBuiltExamples {


    public static void main(String[] args) {
        // stack implementation.
        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(6);
//        stack.push(8);
//        stack.push(34);
//
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());


        // queues support two types of methods for the same operation
        // one will return the exception when the queues condition are violated.
        // for example retrieve the data from the empty queue.
        // another type of methods will return the default values like null in case
        // of object and default values to respective primitives.
        // see the Queue interface and since the Queue is an interface we can use its
        // reference variable to know what it can access but we can't create instance of
        // interface so we have to implement the methods in class where this is implementing.
        Queue<Integer> queue = new LinkedList<>();
//        queue.add(87);
//        queue.add(34);
//        queue.add(97);
//
//        System.out.println(queue.element());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());
//
//
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.push(12);
//        deque.push(98);
//        deque.push(46);
//
//        deque.pop();
//        deque.pop();
//        deque.pop();
//        System.out.println(deque.isEmpty());

        // we can implement stacks and queues using deque also.
        // see the internal implementation.

    }
}
