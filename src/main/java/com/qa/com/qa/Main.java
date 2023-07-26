package com.qa.com.qa;
import com.qa.model.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle ("rectangle1", "yellow", 0, 0, 10, 10);
        Rectangle r2 = new Rectangle ("rectangle2", "green", 2, 2, 5, 2);
        System.out.println(r);
        System.out.println(r2);
        System.out.println(r + ", CentrePoint is: "
                        + r.getCentrePoint() + ", Area is: " + r.getArea()
                        + ". Is it square? " + r.isSquare());
        System.out.println(r2 + ", CentrePoint is: "
                        + r2.getCentrePoint() + ", Area is: " + r2.getArea()
                        + ". Is it square? " + r2.isSquare());
        Circle c = new Circle ("circle1", "red", 0,0, 10);
        Circle c2 = new Circle ("circle2", "blue", 10,10, 5);
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c + ", CentrePoint is: " +
                            c.getCentrePoint() + ", Area is: " + c.getArea());
        System.out.println(c2 + ", CentrePoint is: " +
                            c2.getCentrePoint() + ", Area is: " + c2.getArea());
        c.move(10.5, 4.3);
        System.out.println(c + ", CentrePoint is: " +
                c.getCentrePoint() + ", Area is: " + c.getArea());

        Cat cat1 = new Cat("Whiskers", 10);
        Cat cat2 = new Cat("Midas", 8);
        Dog dog = new Dog("Spot", 2);
        Rabbit rabbit1 = new Rabbit("Peter", 2);
        Rabbit rabbit2 = new Rabbit("Cottontail", 3);
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(dog);
        animals.add(rabbit1);
        animals.add(rabbit2);
        for (Animal animal: animals)
        {
            System.out.println(animal);
        }
        HashMap<String, Animal> animalMap = new HashMap<String, Animal>();
        animalMap.put(cat1.getName(), cat1);
        animalMap.put(cat2.getName(), cat2);
        animalMap.put(dog.getName(), dog);
        animalMap.put(rabbit1.getName(), rabbit1);
        animalMap.put(rabbit2.getName(), rabbit2);
        for (String key:animalMap.keySet())
        {
            System.out.println("Key: " + key + " Value: " + animalMap.get(key));
        }
        HashSet<Animal> set = new HashSet<>();
        set.addAll(animals);
        System.out.println(set);
        Iterator<Animal> iter = set.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("\nFinding Spot.");
        for (Animal a : animals) {
           if (a.getName().equals("Spot")) {
               System.out.println(
                       "Found Spot in the ArrayList: " + a);
           }
        }
        System.out.println("Found Spot in the HashMap: " +
                             animalMap.get("Spot"));
        Collections.sort(animals);
        System.out.println("Sorted");
        for (Animal animal: animals) {System.out.println(animal);}
        TreeMap<String, Animal> treemap = new TreeMap<>(animalMap);
        System.out.println("TreeMap");
        for(String key: treemap.keySet()) {System.out.println(key + " " + treemap.get(key));}

    }
}
