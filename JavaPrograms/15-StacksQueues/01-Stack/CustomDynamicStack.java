package com.StacksQueues.Stack;

public class CustomDynamicStack extends CustomStack {

    public CustomDynamicStack() {
        super(); // will call CustomStaticStack() constructor
    }

    public CustomDynamicStack (int size) {
        super(size); // this will call CustomStaticStack(int size) constructor
    }

    @Override
    public int push(int item) throws StackException {
        if (isFull()) {
           resize();
        }
        return super.push(item);
    }

    private void resize() {
        int[] temp = new int[2 * data.length];

        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }



}
