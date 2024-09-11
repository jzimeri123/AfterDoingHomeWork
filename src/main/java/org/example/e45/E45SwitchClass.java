package org.example.e45;

import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println( "Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)");
        int coffeeType= input.nextInt();

        switch (coffeeType){
            case 1:
                System.out.println("The price of your coffee is $3.0");
                        break;
            case 2:
                System.out.println("The price of your coffee is $4.0");
                break;
            case 3:
                System.out.println("The price of your coffee is $4.5");
                break;
            case 4:
                System.out.println("The price of your coffee is $5.0");
                break;
            default:
                System.out.println( "Invalid coffee type entered");
                break;
                //test passed

        }
    }
}
