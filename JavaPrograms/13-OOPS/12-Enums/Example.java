package com.OOPS.Enums;

public class Example {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enums constants
        // by default public, static and final
        // Since these are final we can't create object of these types.
        // type is Week.


        Week() {
            System.out.println("constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hello how are you?");
        }
        // Constructor is public or protected, private or default
        // why? because we don't want to create new objects
        // because this is the concept of enum, that's why.

//        internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        for(Week day: Week.values()) {
            System.out.println(day);
        }

        System.out.println(week.ordinal()); // this is the order in which it is declared in enum.
    }
}
