package com.OOPS.PackagesStaticBasics.staticExample;



public class InnerClasses { // this is non-static i.e. this is dependent on the instance of this class

     static class Test {
         String name;

        public Test(String name) {
            this.name = name;
        }

         @Override
         public String toString() {
             System.out.println("Whoooo");
             return this.name;
         }
     }
    public static void main(String[] args) {
       Test a = null;
       Test b = new Test("Rahul");

        System.out.println(a);
        System.out.println(b.name);

    }
}


