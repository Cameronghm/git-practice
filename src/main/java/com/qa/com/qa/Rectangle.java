package com.qa.com.qa;

public class Rectangle extends Shape {
    private double height;
    private double width;
    public Rectangle(String name, String colour, double x, double y, double height, double width) {
        super(name, colour, x, y);
        this.height = height;
        this.width = width;
    }
    public boolean isSquare()
    {
        return (height == width);
    }
    public double getArea(){
        return height*width;
    }
    public Point getCentrePoint(){
        return new Point(getX()+width/2, getY()+height/2);
    }
    public String toString()
    {
        return "Height: " + height + " Width: " + width;
    }
}
