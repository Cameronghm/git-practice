package com.qa.com.qa;

public class Circle extends Shape implements Movable{
    private double radius;
    public Circle(String name, String colour, double x, double y, double radius){
        super(name, colour, x, y);
        this.radius = radius;
    }
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    public Point getCentrePoint()
    {
        return new Point(getX(), getY());
    }
    public Point getCurrentLocation()
    {
        return getCentrePoint();
    }
    public void move(double x, double y)
    {
        setX(x+getX());
        setY(y+getY());
    }
    public String toString() {
        return "Name: " + getName() + " colour: " + getColour() + " X: " + getX() + " Y: " + getY() + " Area: " + getArea() + " Centre Point: " + getCentrePoint() + " Radius: " + radius;
    }
}
