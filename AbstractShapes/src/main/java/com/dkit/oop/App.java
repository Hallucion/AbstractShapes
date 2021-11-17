package com.dkit.oop;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Abstract class Shape
 * oop-abstract-class-shape
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Abstract Class Shapes Below \n" );
        App app = new App();
        app.start();
    }

    public void start() {

        //  Shape s1 = new Shape(2,3);  // compiler will complain. Cannot create an object of an Abstract class.

        System.out.println( "=====CIRCLES===== \n" );
        Circle c1 = new Circle(1,2,5);
        System.out.println(c1.toString());
        Circle c2 = new Circle(1,2,5);
        System.out.println(c2.toString());
        System.out.println("\n ====================");

        //TODO
        // implement the Rectangle class (see skeleton Rectangle class).

        System.out.println( "\n =====Rectangles===== " );
        Rectangle rec1 = new Rectangle(7 ,13, 21,12);
        System.out.println("\n" + rec1.toString());

        Rectangle rec2 = new Rectangle(3,5,12,22);
        System.out.println(rec2.toString());
        System.out.println("\n====================");


        // instantiate a Rectangle object r1, and output its details.

        //TODO
        // create an ArrayList and populate it with two Circles and two Rectangles.


        ArrayList <Shape> shapes = new ArrayList<>();
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(rec1);
        shapes.add(rec2);

        System.out.println("\n These are the list of Shapes \n" + shapes);


        // write a displayList() method that accepts the list and display all elements.
        // using a for loop, sum the area of all the shapes and output that sum.

        //TODO
        // The senior architect informs you that all shapes MUST have a method
        // called perimeter() that returns the perimeter of the shape.
        // Make the appropriate changes to the Shape, Circle and Rectangle classes.
    }
}
