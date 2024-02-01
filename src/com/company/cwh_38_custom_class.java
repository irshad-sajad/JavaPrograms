package com.company;

class Employee{
    int id;
    int salary;
    String name;
    public void getDetails(){
        System.out.println("my id is: "+ id);
        System.out.println("my name is: "+ name);
    }
    public int getSalary(){
        return salary;
    }
}
public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee obj = new Employee(); // Instantiating a new Employee object
        Employee obj1 = new Employee(); // Instantiating a new Employee object

        // Setting Attributes for obj
        obj.id = 101;
        obj.salary = 45;
        obj.name = "Harry";

        // setting attributes for obj1
        obj1.id = 102;
        obj1.salary = 30;
        obj1.name = "Rahul";

        // Printing the Attributes
        obj.getDetails();
        int salary = obj.getSalary();
        System.out.println("my salary is: "+salary);
        obj1.getDetails();
        int salary1 = obj1.getSalary();
        System.out.println("my salary is: "+salary1);
        //System.out.println(obj.id);
        //System.out.println(obj.name);
    }
}
