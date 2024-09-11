package org.example.e166;

public class E166MultipleInterface {

    public static void main(String[] args) {
SmartHomeDevice shd=new SmartHomeDevice();
shd.turnOn();
shd.configure();
    }
}

interface Controllable{
    void turnOn();

}

interface Configurable{
    void configure();
}

class SmartHomeDevice implements Controllable,Configurable{
    public void turnOn(){
        System.out.println("Turning on Smart Home Device");
    }
    public void configure(){
        System.out.println("Configuring Smart Home Device settings");
    }

}

