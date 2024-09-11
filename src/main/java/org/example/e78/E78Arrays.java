package org.example.e78;

public class E78Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int sum=0;
        int[][] num = {

                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                sum+=num[i][j];
            }
        } System.out.println(sum);

        // Use nested loops to iterate through the 2D array and calculate the sum of all elements

        // Print the calculated sum
    }
}
