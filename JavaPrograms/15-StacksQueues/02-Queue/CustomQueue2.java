package com.StacksQueues.Queue;

import java.util.Queue;

public class CustomQueue2 {
    protected int[] data;
    private final static int INITIAL_VALUE = 5;
    private int e; // end pointer

    public CustomQueue2() {
        this(INITIAL_VALUE);
    }

    public CustomQueue2(int size) {
        this.data = new int[size];
        this.e = 0;
    }

    public boolean add(int val) throws QueueException {
        if (isFull()) {
            throw new QueueException("Queue is full!!");
        }
        data[e++] = val;
        return true;
    }

    public int remove() throws QueueException{
        if (isEmpty()) {
            throw new QueueException("Queue is empty can't remove anything!!");
        }
        int removed = data[0];
        for (int i = 1; i < e; i++) {
            data[i - 1] = data[i];
        }
        e--;
        return removed;
    }

    public int element() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty can't remove anything!!");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < e; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

    public boolean isFull() {
        return e == data.length;
    }

    public boolean isEmpty() {
        return e == 0;
    }
}
