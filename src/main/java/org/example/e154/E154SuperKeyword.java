package org.example.e154;

public class E154SuperKeyword {
    public static void main(String[] args) {
WashingMachine w=new WashingMachine();
WashingMachine w2=new WashingMachine(500,7);
    }
}

class Appliance{

    //creating  no-argument constructor
    public Appliance(){
        System.out.println("Appliance Constructor without argument");
    }

    //creating parameterized constructor
    public Appliance(int wattage){
        System.out.println("Wattage: "+wattage);
    }
}

class WashingMachine extends Appliance{
    //creating no-argument constructor
    public WashingMachine(){
        System.out.println("WashingMachine Constructor without argument");
    }

    //creating overloaded constructor
    public WashingMachine(int wattage,int capacity){
        super(wattage);
        System.out.println("Capacity: "+capacity);

    }

}