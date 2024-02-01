package com.company;

class MyEmployee{
    private int id;
    private String name;

    // instead of using getters & setters to get and set the value for each and every attribute, we can simply use Constructors.
    // Constructor --> A member function used to initialize an object while creating it. In order to write our own constructor
    // we define a method with same name as class name. and we set values to attributes either directly or by passing arguments.
    // we do not need to call/invoke this constructor method explicitly in main method, this gets automatically invoked.
    // constructor overloading:
    // constructors can be overloaded just like other methods in Java. We can overload the Employee constructor like below:
    public MyEmployee(){
        id = 24;
        name = "Tony Stark";
    }
    public MyEmployee(String myName){
        id = 1;
        name = myName;
    }
    public MyEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }

    // Setters
    public void setId(int i){
        id = i;
    }
    public void setName(String n){
        name = n;
    }
    // Getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class cwh_42_constructors {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
//        emp.setId(10);
//        emp.setName("CodeWithJun");
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
