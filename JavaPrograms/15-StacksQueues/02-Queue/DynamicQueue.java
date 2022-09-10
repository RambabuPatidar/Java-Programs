package com.StacksQueues.Queue;

public class DynamicQueue extends CustomQueue{

    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean add(int val) throws QueueException {
        if (isFull()){
            resize();
        }
        return super.add(val);
    }

    private void resize() {
        int[] temp = new int[2 * data.length];
        // this will copy all the item of the data into the temp;
        System.arraycopy(data, 0,temp, 0,data.length);

        data = temp;
    }
}
