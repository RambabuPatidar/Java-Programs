package com.OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Given below are the overloaded constructors.
//        Box box = new Box(12);
//        Box box1 = new Box(box);
//        Box box2 = new Box(1.11, 3.12, 9.08);
//
////        System.out.println(box.l + " " + box.b + " " + box.h );
////        System.out.println(box1.l + " " + box1.b + " " + box1.h );
////        System.out.println(box2.l + " " + box2.b + " " + box2.h );
////        box.information();
//        BoxWeight box3 = new BoxWeight(4.0, 4.0, 4.0, 12);

/*        NOTE 01
        we can store an object of child class in parent class reference variable and since the child class i.e. BoxWeight knows about the variables of parent class it can also initialise them and its own too.
        But the type of the reference variable is the one who will determine that what(more focus on WHAT) are the properties this variable can access and not the object.
        and in our example below Box class only aware of the l, b, h so the reference variable box4 can only access the public member of the Box class
        it has no idea about the properties of the child class hence it can't access the weight.
*/
//        Box box4 = new BoxWeight(1, 2, 3, 4);
//        System.out.println(box4.h + " " + box4.b); // only this can be accessed
//        System.out.println(box4.l + " " + box4.weight ); // this cannot be accessed.

/*        NOTE 02
        since we know that the reference variable is the one who will determine that what properties it can access.
        and in our example below our reference variable is of the type BoxWeight hence it can access all the properties of the parent class which are public and its own too.
        now  if we see in the right-hand side, we are calling teh parent class i.e. Box class constructor
        and the Box class constructor doesn't know anything about the child class properties. as only the child class can access the base class
        the vice versa is not true.
        hence,we can't assign a parent class object to the child class reference variable.
*/
//        BoxWeight box5 = new Box(1, 2, 3, 4); // this is illegal.

        BoxWeight obj = new BoxWeight();
        obj.greeting();
    }
}
