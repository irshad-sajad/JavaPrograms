package com.company;

class Circle1{
    private float radius;
    private float area;
    private float perimeter;

    // setters -->>> sets/updates the value (mutators)
    public void setRadius(float r){
        radius = r;
    }
    public void setArea(float r){
        area = 3.14f * r * r;
    }
    public void setPerimeter(float r){
        perimeter = 2*3.14f*r;
    }

    // getters -->>> returns the value (accessors)
    public float getRadius(){
        return radius;
    }
    public float getArea(){
        return area;
    }
    public float getPerimeter(){
        return perimeter;
    }
}

public class cwh_40_ch9 {
    public static void main(String[] args) {
        Circle1 cir = new Circle1();
        cir.setRadius(4);
        System.out.println("the radius of this circle is: "+cir.getRadius());
        cir.setArea(4);
        System.out.println("the area of this circle is: "+cir.getArea());
        cir.setPerimeter(4);
        System.out.println("the perimeter of this circle is: "+cir.getPerimeter());
    }
}
