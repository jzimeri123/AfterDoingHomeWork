package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {

       Scanner input=new Scanner(System.in);

        System.out.println("Do you need a loan? (true/false)");
        boolean needsLoan= input.nextBoolean();
        if (needsLoan){
            System.out.println("What is your credit score?");
            int creditScore= input.nextInt();
            if (creditScore<600){
                System.out.println("The eligibility is Not eligible");
            }else if (creditScore>=600&&creditScore<=700){
                System.out.println("The eligibility is Maybe eligible");
            }else if (creditScore>700&&creditScore<=800){
                System.out.println("The eligibility is Eligible");
            }else if (creditScore>800){
                System.out.println("The eligibility is Definitely eligible");
            }
        }else {
            System.out.println("The eligibility is Unknown");
        }


        // Create a Scanner object to read input

        // Print prompt for user to answer if they need a loan
        // Capture the loan requirement input

        // Check if the user needs a loan

        // Step 1: Create a Scanner Object




    }
}
