package org.example.e150;

public class E150Inheritance {
    public static void main(String[] args) {
Employee emp1=new Employee();
emp1.setName("Joe");
emp1.setLastName("Smith");
emp1.setAge(35);
emp1.setSalary(35000);
emp1.printEmployeeDetails();

Student stu=new Student();
stu.setName("Adam");
stu.setLastName("Smith");
stu.setAge(15);
stu.setGrade(10);
stu.PrintStudentDetails();

Retiree ret=new Retiree();
ret.setName("Frank");
ret.setLastName("Smith");
ret.setAge(15);
ret.setSeniorActivity("tour");
ret.printRetireeDetails();

    }
}

class Person{
    private String name;
    private String lastName;
    private int age;

    //getter and setter methods
   public String getName(){
        return name;
   }
   public void setName(String name){
       this.name=name;
   }

   public String getLastName(){
        return lastName;
   }
   public void setLastName(String lastName){
       this.lastName=lastName;
   }

   public int getAge(){
        return age;
   }
   public void setAge(int age){
       this.age=age;
   }

}


class Employee extends Person{
    private int salary;

    //getter and setter

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    void printEmployeeDetails(){
        System.out.println(getName()+" "+getLastName()+" "+getAge()+" "+getSalary());


    }
}



class Student extends Employee{
    private int grade;

    //getter and setter
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    void PrintStudentDetails(){
        System.out.println(getName()+" "+getLastName()+" "+getAge()+" "+getGrade());


    }
}

class Retiree extends Student{
    private String seniorActivity;

    //getter and setter methods
    public String getSeniorActivity(){
        return seniorActivity;
    }
    public void setSeniorActivity(String seniorActivity){
        this.seniorActivity=seniorActivity;
    }

    void printRetireeDetails(){
        System.out.println(getName()+" "+getLastName()+" "+getAge()+" "+getSeniorActivity());
    }


}