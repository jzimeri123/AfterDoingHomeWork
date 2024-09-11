package org.example.e169;

public class E169Encapsulation {
    public static void main(String[] args){
Employee emp=new Employee();
emp.setEmpName("John");
emp.setEmpAge(30);
        System.out.println("Employee Name: "+emp.getEmpName());
        System.out.println("Employee Age: "+emp.getEmpAge());

    }
}

class Employee{
    //declaring two private variables
    private String empName;
    private int empAge;

    //getter methods
    public String getEmpName(){
        return empName;
    }
   public int getEmpAge(){
        return empAge;
   }

    //setter methods
    public void setEmpName(String empName){
        this.empName=empName;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}

