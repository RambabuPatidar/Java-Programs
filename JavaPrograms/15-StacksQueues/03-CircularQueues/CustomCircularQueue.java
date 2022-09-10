package com.StacksQueues.CircularQueues;

public class CustomCircularQueue {
    protected int[] data;
    private final static int INITIAL_VALUE = 5;
    protected int front;
    protected int end;
    protected int size;

    public CustomCircularQueue() {
        this(INITIAL_VALUE);
    }

    public CustomCircularQueue(int n) {
        this.data = new int[n];
        this.front = 0;
        this.end = 0;
        this.size = 0;
    }

    public boolean add(int val) throws Exception {
        if (isFull()) {
            throw new Exception("Circular Queue is full");
        }
        data[end++] = val;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Circular Queue is Empty");
        }
        int removed = data[front];
        front++;
        front %= data.length;
        size--;
        return removed;
    }

    public int element() throws Exception {
        if (isEmpty()) {
            throw new Exception("Circular Queue is Empty");
        }
        return data[front];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        int temp = front;
        do {
            System.out.print(data[temp] +  " -> ");
            temp++;
            temp %= data.length;
        } while (temp != end);
        System.out.println("END");
    }
}
