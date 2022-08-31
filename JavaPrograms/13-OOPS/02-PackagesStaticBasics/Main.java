package com.OOPS.PackagesStaticBasics;

class Shape{

    int x;
    int y;
    Shape(){

    }
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int disFromOrigin() {
        return (int)(Math.sqrt(Math.pow(x,2) + Math.pow(y,2)));
    }
}

class Circle extends Shape{
    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }


} // this is what we call the inheritance

class Square extends Shape{
    int length;
    static int sides = 4;

    public Square(int x, int y, int length, int sides) {
        super(x, y);
        this.length = length;
        Square.sides = sides;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3, 4, 5);
        System.out.println("x: " +circle.x);
        System.out.println("y: " + circle.y);
        System.out.println("Radius: " +circle.radius);
        System.out.println("The distance of the coordinate from the origin is: " + circle.disFromOrigin());
    }
}