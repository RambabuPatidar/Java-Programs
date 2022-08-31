package com.OOPS.PackagesStaticBasics.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;
    // this is the static block and will only run one time i.e. when the first time the class is loaded;
    static {
        System.out.println("I am here inside the static block");
        b = a * 7;
    }

    public static void main(String[] args) {
        StaticBlock block = new StaticBlock(); // this default constructor is provided automatically
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        // Neither this will now  run the static block
        StaticBlock.b += 12;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        // Nor the creation of object instantiation will run static block
        StaticBlock block2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


    }
}
