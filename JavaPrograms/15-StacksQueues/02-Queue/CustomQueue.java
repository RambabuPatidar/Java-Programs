package com.StacksQueues.Queue;

// this implementation uses two pointers start and end.
// there is also a method with one pointer.

public class CustomQueue {
    protected int[] data;
    private final static int INITIAL_VALUE = 5;
    private int s;
    private int e;

    public CustomQueue() {
        this(INITIAL_VALUE);
    }

    public CustomQueue(int n) {
        this.data = new int[n];
        this.s = -1;
        this.e = -1;
    }

    public boolean add (int val) throws QueueException {
        // if the queue is full
        if (isFull()) {
            throw new QueueException("Queue is already full !!");
        }
        if (s == -1) {
            s++;
        }
        e++;
        data[e] = val;
        return true;
    }

    public int remove() throws QueueException{
        if (isEmpty()) {
            throw new QueueException("Queue is already empty!!");
        }
//        int value = data[s];
//        s++;
//        return value;
        return data[s++];
    }

    public int element() throws QueueException{
        if (isEmpty()) {
            throw new QueueException("Nothing on the top.Queue Empty!!");
        }
        return data[s];
    }
    public boolean isEmpty() {
        return s > e;
    }
    public boolean isFull() {
        return e == data.length - 1;
    }
}
