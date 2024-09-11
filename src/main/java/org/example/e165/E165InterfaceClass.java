package org.example.e165;

public class E165InterfaceClass {

    public static void main(String[] args) {
Smartphone sp=new Smartphone();
Laptop l=new Laptop();
sp.turnOn();
sp.turnOff();
l.turnOn();
l.turnOff();
    }

}

//creating interface
interface ElectronicDevice{

    //declaring two unimplemented methods
    void turnOn();
    void turnOff();
}


class Smartphone implements ElectronicDevice{
//creating implementation for turnOn method
    public void turnOn(){
        System.out.println("Smartphone is turning on");
    }
    //creating implementation for turnOff method
    public void turnOff(){
        System.out.println("Smartphone is turning off");
    }
}

class Laptop implements ElectronicDevice{
    public void turnOn(){
        System.out.println("Laptop is turning on");
    }
    //creating implementation for turnOff method
    public void turnOff(){
        System.out.println("Laptop is turning off");
    }





}