package com.StacksQueues.CircularQueues;

import com.StacksQueues.Stack.CustomStack;
import com.StacksQueues.Stack.StackException;

public class CustomDynamicCircularQueue extends CustomCircularQueue {

    public CustomDynamicCircularQueue() {
        super(); // will call CustomStaticStack() constructor
    }

    public CustomDynamicCircularQueue(int size) {
        super(size); // this will call CustomStaticStack(int size) constructor
    }

    @Override
    public boolean add(int item) throws Exception {
        if (isFull()) {
           resize();
        }
        return super.add(item);
    }

    private void resize() {
        int[] temp = new int[2 * data.length];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[(front + i) % data.length];
        }
        front = 0;
        end = data.length;
        data = temp;
    }



}
