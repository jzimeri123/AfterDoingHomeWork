package org.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        // Create a Scanner object to read input from the console

int[] num=new int[5];
        // Create an array of integers with a size of 5
        for (int i = 0; i < num.length ; i++) {
            num[i]= input.nextInt();
        }

        // Use a loop to read 5 integers from the user and store them in the array
        // (Do not print any prompt message for the user)
        for (int i = 0; i < num.length ; i++) {
            num[i]=num[i]*10;
            System.out.println(num[i]);
        }
        // Use another loop to multiply each element of the array by 10 and print the result

    }
}
