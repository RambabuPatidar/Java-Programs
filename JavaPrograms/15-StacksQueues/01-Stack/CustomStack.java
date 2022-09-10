package com.StacksQueues.Stack;
// This is static stack that means the size is not flexible.
public class CustomStack {

    protected int[] data;
    private int index;
    private final static int INITIAL_SIZE = 10;

    public CustomStack() {
        this(INITIAL_SIZE);
    }

    public CustomStack(int size) {
        this.index = 0;
        this.data = new int[size];
    }

    public int push (int item) throws StackException {
        if (isFull()) {
            throw new StackException("Stack is full Can't insert!!");
        }
        data[index++] = item;
        return item;
    }

    public boolean isFull() {
        return index == data.length;
    }

    public int pop() throws StackException {
        if (index == 0) {
            throw new StackException("Cannot pop from an empty stack!!");
        }
        int value = data[index - 1];
        index--;
        return value;
    }

    public int top() throws StackException {
        if (index == 0) {
            throw new StackException("Cannot pop from an empty stack!!");
        }
        return data[index - 1];
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        return index == 0;
    }
}
