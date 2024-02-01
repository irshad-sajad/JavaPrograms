package com.company;

//problem-1
class Circle2{
    public int radius;

    Circle2(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle2{
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder parameterized constructor");
    }
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

//problem-2
class Rectangle2{
    public int length;
    public int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Default Constructor
    public Rectangle2(){
        System.out.println("I am a default constructor");
    }
    // Parameterized Constructor to set length and breadth
    public Rectangle2(int length, int breadth) {
        System.out.println("I am a Rectangle parameterized constructor");
        this.length = length;
        this.breadth = breadth;
    }
    // Methods to calculate area and perimeter
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
class Cuboid extends Rectangle2{
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Cuboid(int l, int b, int h){
        super(l,b);
        System.out.println("I am a Cuboid parameterized constructor ");
        this.height = h;
    }
    public int totalSurfaceArea(){
        return 2*(length*breadth+breadth*height+length*height);
    }
    public int lateralSurfaceArea(){
        return 2*height*(length+breadth);
    }
    public int volume(){
        return length*breadth*height;
    }
}

public class cwh_52_ch10_ps {
    public static void main(String[] args) {
        //problem-1
        //Circle2 obj = new Circle2();

        //problem-2
        //Rectangle2 rec = new Rectangle2();
        //Cuboid c = new Cuboid(4,2,10);

        //problem-4
        //Rectangle2 r = new Rectangle2();
        //r.setLength(4);
        //r.setBreadth(3);
        //System.out.println(r.getLength());
        //System.out.println(r.getBreadth());

        //Cuboid c = new Cuboid(4,3,10);
        //c.height(10);
        //System.out.println(c.getHeight());
    }
}
