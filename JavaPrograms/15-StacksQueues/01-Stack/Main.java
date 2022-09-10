package com.StacksQueues.Stack;

public class Main {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack();
        stack.push(12);
        stack.push(43);
        stack.push(65);
        stack.push(65);
//        stack.push(65);
//        stack.push(6);
//        stack.push(65);
//        stack.push(6565);
//        stack.push(653);
//        stack.push(6235);
//        stack.push(265);
//        stack.push(1265);
//        stack.push(665);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());



        CustomDynamicStack dStack = new CustomDynamicStack(5);// or
        CustomStack dStack2 = new CustomDynamicStack();
        dStack.push(1);
        dStack.push(2);
        dStack.push(3);
        dStack.push(4);
        dStack.push(5);
        dStack.push(6);

        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
//        System.out.println(dStack.size());
    }
}
