package com.StacksQueues.CircularQueues;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomCircularQueue queue = new CustomCircularQueue();
        queue.add(1);
        queue.add(23);
        queue.add(89);
        queue.add(45);
        queue.add(2);

        queue.display();
        System.out.println(queue.remove());
        queue.add(12);
        queue.display();
        queue.add(154);
    }
}
