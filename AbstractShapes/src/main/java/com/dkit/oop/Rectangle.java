package com.dkit.oop;
//TODO
// change Rectangle declaration so that Rectangle inherits from Shape

public  class Rectangle extends Shape{

    //TODO
    // Rectangle requires fields 'width' and 'height'.
    // implement toString() and getters/setters.
    // area() must be implemented.

 private int width;
 private int height;

 public Rectangle (int x, int y, int width, int height)
 {
     super(x, y);
     this.width = width;
     this.height = height;
 }

    @Override
    public double area()
    {
        return this.height * this.width;
    }

    public int getHeight(int height)
    {
        return height;
    }

    public int getWidth(int width)
    {
        return width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    @Override
    public String toString()
    {
        // call superclass toString method to get Shape details
        return super.toString() + "[height=" + this.height + "]" + "[width=" + this.width + "]";
    }





}
