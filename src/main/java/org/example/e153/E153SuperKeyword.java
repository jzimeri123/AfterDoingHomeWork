package org.example.e153;

import org.example.e87.Car;

public class E153SuperKeyword {
    public static void main(String[] args) {
Cars c=new Cars();

    }
}

class Vehicle{

    Vehicle(){
        System.out.println("This is the Vehicle constructor");
    }

}

class Cars extends Vehicle{
    Cars(){
        super();
    }
}