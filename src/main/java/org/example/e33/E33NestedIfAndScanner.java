package org.example.e33;

import java.util.Scanner;

public class E33NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        int residue = number % 2;
        if (residue > 0) {
            System.out.println("Value is odd");
            if (number > 1000) {
                System.out.println("Odd value is large");
            } else {
                System.out.println("Odd value is just right");
            }

        } else {
            System.out.println("Value is even");
            if (number > 1000) {
                System.out.println("Even value is large");
            } else {
                System.out.println("Even value is just right");
            }
        }
    }
}



// Create a Scanner object to read input

        // Print prompt for user to enter a number
        // Capture the number input

        // Classify the number
        // Use an if-else statement to check if the number is even or odd

        // Create a Scanner object to read input from the console




