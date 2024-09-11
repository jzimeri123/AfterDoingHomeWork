package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String str= input.next();
        String strNew=str.substring(0,3);
        System.out.println("The first 3 letters of "+str+" is "+strNew);
        // Create a Scanner object to read input from the console
        // Prompt the user to input a string value
        // Read the input string
        // Extract the first 3 letters using the substring() method
        // Print the result in the specified format
    }
}
