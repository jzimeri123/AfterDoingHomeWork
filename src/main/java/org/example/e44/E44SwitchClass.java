package org.example.e44;

import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        int mealType=input.nextInt();

        switch (mealType){
            case 1:
                System.out.println("The price of your meal is $5.0");
                break;
            case 2:
                System.out.println("The price of your meal is $10.0");
                break;
            case 3:
                System.out.println("The price of your meal is $15.0");
                break;
            default:
                System.out.println("Invalid meal type entered");
                break;
                //test passed
        }


    }
}
