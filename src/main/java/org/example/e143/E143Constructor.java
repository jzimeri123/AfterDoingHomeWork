package org.example.e143;

public class E143Constructor {


    public static void main(String[] args) {
Car c1=new Car("Toyota","Prius",4,120,30000);
Car c2=new Car("Toyota","Prius",120,30000);
Car c3=new Car(4,120,30000);
Car c4=new Car("Toyota","Prius",4);
c1.display();
c2.display();
c3.display();
c4.display();
    }
}


class Car{
    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;

    //first constructor
    public Car(String make,String model,int numberOfDoors,int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }

//second constructor
    public Car(String make,String model,int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=4;
        this.topSpeed=topSpeed;
        this.price=price;
    }

    //third constructor
    public Car(int numberOfDoors,int topSpeed,double price){
        this.make="unknown";
        this.model="unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }

    //fourth constructor
    public Car(String make,String model,int numberOfDoors){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=90;
        this.price=0;
    }

    public void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }
}

