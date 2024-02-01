package com.company;

import java.awt.*;

class Employee1 {
    //attributes
    int salary;
    String name;
    //methods
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class CellPhone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void call(){
        System.out.println("calling...");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
class TommyVecetti{
    public void hit(){
        System.out.println("hitting...");
    }
    public void run(){
        System.out.println("running...");
    }public void fire(){
        System.out.println("firing...");
    }
}
class Circle{
    float radius;
    public float area(){
        return 3.14f*radius*radius;
    }
    public float perimeter(){
        return 2*3.14f*radius;
    }
}

public class cwh_39_ch8_ps {
    public static void main(String[] args) {
        /*
        //problem-1
        Employee1 emp = new Employee1();
        emp.setName("Harry");
        emp.salary = 55;
        System.out.println(emp.getSalary());
        System.out.println(emp.getName());

        //problem-2
        CellPhone realme = new CellPhone();
        realme.ring();
        realme.vibrate();
        realme.call();


        //problem-3
        Square sq = new Square();
        sq.side = 3;
        System.out.println("the area of this square is: "+sq.area());
        System.out.println("the perimeter of this square is: "+sq.perimeter());

        //problem-4
        Rectangle rec = new Rectangle();
        rec.length = 4;
        rec.breadth = 2;
        System.out.println("area of this rectangle is: "+rec.area());
        System.out.println("perimeter of this rectangle is: "+rec.perimeter());
        */

        //problem-5
        TommyVecetti player1 = new TommyVecetti();
        player1.hit();
        player1.run();
        player1.fire();

        //problem-6
        Circle cir = new Circle();
        cir.radius = 3.0f;
        System.out.println("the area of this circle is: "+cir.area());
        System.out.println("the perimeter of this circle is: "+cir.perimeter());
    }
}
