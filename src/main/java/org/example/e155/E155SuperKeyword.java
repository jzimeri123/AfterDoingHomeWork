package org.example.e155;

public class E155SuperKeyword {
    public static void main(String[] args) {
Employee e=new Employee();

    }
}



class Company{

    //creating Default Constructor parent Class
    public Company(){
        System.out.println("Company Established");
    }
}


class Department extends Company{
    //creating Default Constructor subclass
    public Department(){
        System.out.println("Department Created");
    }

}

class Employee extends Department{
    //creating Default Constructor subsubclass
    public Employee(){
        System.out.println("Employee Hired");
    }

}