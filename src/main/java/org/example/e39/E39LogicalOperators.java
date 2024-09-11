package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your mark");
        int marks= input.nextInt();

        if (marks>0&&marks<=25){
            System.out.println("Your grade is F");
        }else if (marks>25&&marks<=45){
            System.out.println("Your grade is E");
        }else if (marks>45&&marks<=50){
            System.out.println("Your grade is D");
        }else if (marks>50&&marks<=60){
            System.out.println("Your grade is C");
        }else if (marks>60&&marks<=80){
            System.out.println("Your grade is B");
        }else if (marks>80&&marks<=100){
            System.out.println("Your grade is A");
        }else {
            System.out.println( "Please enter valid mark");

        }
        // Create a Scanner object to read input
        // Print prompt for user to enter their mark
        // Capture the mark input
        // Determine the grade based on the mark
        // Print the grade
        // Output: Your grade is ____


    }
}
