package com.company;

class Cylinder{
    private float radius;
    private float height;

    //problem-3 --> use a constructor and repeat problem-1
    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public double surfaceArea(){
        return (2*Math.PI*radius*radius)+(2*3.14*radius*height);
    }
    public double volume(){
        return (Math.PI*radius*radius*height);
    }
}
class Rectangle1{
    private int length;
    private int breadth;

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
class Sphere{
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }

    public double volume(){
        return (4*Math.PI*(Math.pow(radius,3)))/3;
//        return (4*Math.PI*radius*radius*radius)/3;
    }
}

public class cwh_44_ch9_ps {
    public static void main(String[] args) {
        /*
        //problem-1:
        //create a class Cylinder and use getters and setters to set its radius and height.

        Cylinder myCylinder = new Cylinder(4,12);
        //myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        //myCylinder.setRadius(4);
        System.out.println(myCylinder.getRadius());

        //problem-2:
        //use problem-1 to calculate surface area and volume of the cylinder.
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        //problem-3:
        //use a constructor and repeat problem-1

        //problem-4;
        //overload a constructor used to initialize a rectangle of length of 4 and breadth 5 for using custom parameters.
        Rectangle1 r = new Rectangle1();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        */

        //problem-5:
        //repeat problem-1 for a sphere
        Sphere s = new Sphere();
        s.setRadius(5);
        System.out.println(s.getRadius());
        System.out.println(s.surfaceArea());
        System.out.println(s.volume());
    }
}
