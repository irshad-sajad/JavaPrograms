package com.company;

// Base Class(Super Class): is a parent class form which we can derive subclasses.
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base class and setting x ");
        this.x = x;
    }
}
// Derived Class(Subclass): is a child class which inherits parts of superclass methods and fields.
// Java doesn't support multiple inheritance i.e., two classes can't be superclasses for a subclass.
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

// Quick Quiz: Create a class Animal and derive another class Dog from it.
class Animal{
    String name;
    String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void sounds(){
        System.out.println("Animal is making noise...");
    }
}
// Derived class
class Dog extends Animal{
    String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark(){
        System.out.println("Dog is barking...");
    }
}
public class cwh_45_inheritance {
    public static void main(String[] args) {
        /*
        // Creating an object of Base class
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX()); //5

        // Creating an object of derived class
        Derived d = new Derived();
        d.setX(7);
        System.out.println(d.getX()); //7
        */

        // Creating an object of Animal class
        System.out.println("I am in Base class");
        Animal animal = new Animal();
        animal.setName("Tommy");
        System.out.println(animal.getName());
        animal.setColor("Brown");
        System.out.println(animal.getColor());
        animal.sounds();

        // Creating an object of Derived class
        System.out.println("I am in Derived class");
        Dog dog = new Dog();
        dog.setBreed("German Shepherd");
        System.out.println(dog.getBreed());
        dog.bark();
    }
}
