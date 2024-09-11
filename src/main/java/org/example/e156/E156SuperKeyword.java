package org.example.e156;

public class E156SuperKeyword {
    public static void main(String[] args) {
        Dog d=new Dog();
d.displaySound();
}
}

class Animal{

    //declaring and initializing variable
    String sound="Some generic animal sound";
}

class Dog extends Animal{
    //declaring and initializing variable
    String sound="Bark";

    void displaySound(){
        System.out.println(sound);
        System.out.println(super.sound);
    }
}
