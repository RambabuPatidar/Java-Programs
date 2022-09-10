package com.StacksQueues.Queue;

// dynamic queues can be understood something that they can increase their size
// when the number of element are greater than the default size;

public class Main {
    public static void main(String[] args) throws QueueException {
//        CustomQueue queue = new DynamicQueue();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//        queue.add(8);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.isEmpty());

        CustomQueue2 queue2 = new DynamicQueue2();
        queue2.add(2);
        queue2.add(5);
        queue2.add(7);
        queue2.add(21);
        queue2.add(56);
        queue2.add(98);

        System.out.println(queue2.remove());
        queue2.display();
    }
}
