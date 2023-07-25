package com.qa.com.qa;

public abstract class Shape {
    private String name;
    private String colour;
    private double x;
    private double y;
    public Shape(String name, String colour, double x, double y)
    {
        this.name = name;
        this.colour = colour;
        this.x = x;
        this.y = y;
    }
    public String getName() {return name;}
    public String getColour() {return colour;}
    public double getX() {return x;}
    public double getY() {return y;}
    public void setName(String name) {this.name = name;}
    public void setColour(String colour) {this.colour = colour;}
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}
    public String toString()
    {
        return "Name: " + name + " Colour: " + colour + " x: " + x + " y: " + y;
    }
    public abstract double getArea();
    public abstract Point getCentrePoint();
}
