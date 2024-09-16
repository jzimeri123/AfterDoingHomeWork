package org.example.e171;

public class E171Encapsulation {
    public static void main(String[] args){

        //creating object of class
        Employee emp=new Employee();

        //calling out methods
        System.out.println("Employee Name: "+emp.getEmpName());
        System.out.println("Employee Age: "+emp.getEmpAge());
    }
}

class Employee{

    //Initializing private instance variables
    private String empName = "John";
    private int empAge = 30;

    //creating getter methods
    public String getEmpName() {
        return empName;
    }
    public int getEmpAge() {
        return empAge;
    }
}

