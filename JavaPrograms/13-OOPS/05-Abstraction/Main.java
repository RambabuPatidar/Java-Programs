package com.OOPS.Abstraction;
// using abstract classes it doesn't mean that we can use multiple inheritance.
// because abstract classes also support the normal classes, and two abstract classes can have a normal function of same type.
// so to do this we use interfaces.
public class Main {

    public static void main(String[] args) {
        Son son = new Son(22);
//        son.career("Engineer");
//        son.partner("XYZ", 20);
//
//
//        Daughter daughter = new Daughter(18);
//        daughter.career("Doctor");
//        daughter.partner("Rambabu Patidar", 22);

        // -we cannot create object of an abstract class like below statement
        // this doesn't implies that we cann't use reference variable of type parent (abstract class)
        // definitely we can use. as we know that the object is only created when we call the constructor of the class through dynamic initialization.
        Parent object = new Daughter(22);

        // - but we can create object when we also define the method override.
//        Parent dad = new Parent(12);


        Parent mom = new Parent(33) {
            @Override
            void career(String name) {
                System.out.println("I am in the main class Overriden function");
            }

            @Override
            void partner(String name, int age) {

            }
        };
        mom.career("SkiDiver");
        
        //-calling static method of abstract class .
        Parent.helloWorld();

        // -calling normal method of abstract class.
        son.normal();

    }

}
