package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {

Scanner input=new Scanner(System.in);

String[] days=new String[7];
        for (int i = 0; i < days.length ; i++) {
            System.out.println("Please enter day "+(1+i)+" of the week:");
            days[i]=input.next();
        }
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        // Create an array of strings with size 7
        // Create a Scanner object to read input from the console
        // Use another loop to iterate through the array and print each value on a new line
        // Use a loop to prompt the user to input the days of the week one by one and store each input in the array
        // Create a Scanner object to read input from the console



    }
}
