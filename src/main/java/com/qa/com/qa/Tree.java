package com.qa.com.qa;

public class Tree {
    private String species;
    private double age;
    private int size;
    public Tree(String species, double age, int size)
    {
        this.species = species;
        this.age = age;
        this.size = size;
    }
    public String getSpecies()
    {
        return species;
    }
    public double getAge()
    {
        return age;
    }
    public int getSize()
    {
        return size;
    }
    public void setSpecies(String species)
    {
        this.species = species;
    }
    public void setAge(double age)
    {
        this.age = age;
    }
    public void setSize(int size)
    {
        this.size = size;
    }
    public String toString()
    {
        return "Species: " + species + " Age: " + age + " Size: " + size;
    }

}
