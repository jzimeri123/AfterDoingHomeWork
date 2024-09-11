package org.example.e55;

import java.util.Scanner;

public class E55DoWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int favoriteNumber;
        do {
            System.out.println("Enter your favorite number:");
            favoriteNumber = input.nextInt();
            System.out.println("You entered: " + favoriteNumber);
            if (favoriteNumber == 7) {
                System.out.println("You've entered 7! Loop ends.");
            }
        } while (favoriteNumber != 7);
    }
}

        // Create a Scanner object to read input
        // Declare a variable for user input
        // Use a do-while loop to collect user input until they enter the number 7
        // Inside the loop:
        // Print "Enter your favorite number:"
        // Capture the user's input and store it in the variable
        // Print "You entered: " followed by the value of the variable

        // Print "You've entered 7! Loop ends."


