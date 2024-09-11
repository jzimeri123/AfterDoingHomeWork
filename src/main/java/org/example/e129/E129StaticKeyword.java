package org.example.e129;

public class E129StaticKeyword {

    static String countryName="Morocco";
    static String continent="Africa";

    static void display(){
        System.out.println(countryName+" located on "+continent+" continent");
    }

    public static void main(String[] args) {

        E129StaticKeyword.display();

    }
}
