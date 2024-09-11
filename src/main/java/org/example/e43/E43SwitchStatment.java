package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your electricity usage in kWh");
        int usage=input.nextInt();
        double bill = 0.0;

        if (usage < 0) {
            System.out.println("Invalid usage entered");
        } else {
            switch (usage / 100) {
                case 0:
                    bill = usage * 0.12;
                    System.out.println("Your electricity bill is $" + bill);
                    break;
                case 1:
                    bill = usage * 0.15;
                    System.out.println("Your electricity bill is $" + bill);
                    break;
                case 2:
                    bill = usage * 0.20;
                    System.out.println("Your electricity bill is $" + bill);
                    break;
                default:
                    bill = usage * 0.25;
                    System.out.println("Your electricity bill is $" + bill);
                    break;
            }
        }
    }

        // Create a Scanner object to read input
        // Print prompt for user to enter their electricity usage in kWh
        // Capture the usage input
        // Calculate bill using switch statement
        // Print the bill
        // Output: Your electricity bill is $____

    }

