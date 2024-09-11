package org.example.e99;

import java.util.Locale;
import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str= input.next();
        String str1=str.replace(" ","");
        String str2=str1.toLowerCase();//first string to be compared
        StringBuilder str3=new StringBuilder(str2);
        StringBuilder str4=str3.reverse();
        String str5=str4.toString();//second string to be compared
        if (str2.equals(str5)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }



        // Create a Scanner object to read input from the console
        // Prompt the user to input a string
        // Read the input string
        // Remove all spaces and convert the string to lowercase
        // Check if the string is a palindrome
        // Print "true" if the string is a palindrome, and "false" otherwise
        // Step 2: Create a Scanner object to read input from the console


    }
}
