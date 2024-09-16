package org.example.e197;


import java.util.HashMap;
import java.util.Map;

public class E197Map {

    public static void main(String[] args) {
        //Initialize the map and Store Dog Objects
        Map<Integer,Dog> dogMap=new HashMap<>();

        //create Dog object and add them to the map
        dogMap.put(1,new Dog("Max", "Labrador",5));
        dogMap.put(2,new Dog("Bella", "Beagle",3));
        dogMap.put(3,new Dog("Rocky", "Bulldog",4));

//Retrieve and Print Dog Information
        for (Map.Entry<Integer,Dog> entry: dogMap.entrySet()){
            System.out.println("Dog ID: "+entry.getKey()+", Details: "+ entry.getValue());
        }

    }
}

class Dog{
    //attributes of dog
    private String name;
    private String breed;
    private int age;

    //constructor to initialize attributes
    public Dog(String name, String breed, int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
        }

        //ovverride the toString() method
    public String toString(){
        return "Dog{name='"+ name + "', breed='"+breed+"', age="+age+ "}";
    }
        }



