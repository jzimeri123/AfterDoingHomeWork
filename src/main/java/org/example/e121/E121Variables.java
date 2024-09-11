package org.example.e121;

public class E121Variables {
    int intValue;
    double doubleValue;
    char charValue;


    // Declare 3 instance variables: integer, double, and char

    public static void main(String[] args) {
        E121Variables n1=new E121Variables();
        n1.intValue=10;
        n1.doubleValue=10.23;
        n1.charValue='a';

        System.out.println(n1.intValue);
        System.out.println(n1.doubleValue);
        System.out.println(n1.charValue);


        E121Variables n2=new E121Variables();
        n2.intValue=100;
        n2.doubleValue=100.23;
        n2.charValue='s';

        System.out.println(n2.intValue);
        System.out.println(n2.doubleValue);
        System.out.println(n2.charValue);

        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance
    }
}
