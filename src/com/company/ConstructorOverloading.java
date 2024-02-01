package com.company;

// Quick Quiz: Overload the Employee Constructor to initialize the salary to Rs. 10,000
class ConstOverloading{
    private String name;
    private double salary;

    // default constructor
    public ConstOverloading(){
        name = "Tony Stark";
        salary = 10000; //initialize salary of 10,000
    }

    // constructor with one parameter
    public ConstOverloading(String employeeName){
        name = employeeName;
        salary = 10000;
    }

    // constructor with name and salary parameter
    public ConstOverloading(String employeeName, double initialSalary){
        name = employeeName;
        salary = initialSalary;
    }
    // get employee details/info
    public void getDetails(){
        System.out.println("name: "+name);
        System.out.println("salary: Rs. "+salary);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        ConstOverloading emp1 = new ConstOverloading();
        emp1.getDetails();
        ConstOverloading emp2 = new ConstOverloading("Bruce Wayne");
        emp2.getDetails();
        ConstOverloading emp3 = new ConstOverloading("Code With Jun", 10000);
        emp3.getDetails();
    }
}
