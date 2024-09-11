package org.example.e152;

public class E152SuperKeyword {
    public static void main(String[] args) {
House h=new House("Vienna");

    }
}

class Building{

    private String location;

    //parameterized constructor
    public Building(String location){
        this.location=location;
        System.out.println(location);
    }

    //default constructor
    public Building(){
        System.out.println("Building Constructor");
    }
}

class House extends Building{

    //parameterized constructor calling parent
    House(String location){
        super(location);
    }
}


