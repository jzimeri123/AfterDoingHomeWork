package org.example.e125;

public class E125Variables {
    // Declare a static variable at the class level to hold an integer value
    static int number;

    public static void main(String[] args) {
        System.out.println(number=200);
        // Access the static variable in the main method and assign a value to it

        // Create an object of the class
                E125Variables n=new E125Variables();
        System.out.println(n.number);

        // Access the static variable in a non-static way using the object and assign a value of 200

        // Print the static variable using the class name

        // Print the static variable using the object instance
    }
}
