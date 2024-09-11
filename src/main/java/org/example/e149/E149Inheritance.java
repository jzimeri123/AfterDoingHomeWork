package org.example.e149;

public class E149Inheritance {

    public static void main(String[] args) {
Car obj=new Car();
obj.make="Toyota";
obj.year=2020;
obj.model="Corolla";
obj.displayCarInfo();
    }
}

class Vehicle{
    String make;
    int year;

    public String displayInfo(){
        System.out.println("Vehicle: "+make+", Year: "+year);
        return null;
    }
}

class Car extends Vehicle{
    String model;

    public void displayCarInfo(){
        super.displayInfo();
        System.out.println("Model: "+model);
         }

}