package org.example.e79;

public class E79Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values

        int[][] num = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
        int[] sum=new int[num.length];
        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                sum[i]+=num[i][j];
            }
            System.out.println(sum[i]);

        }

        // Declare an array to store the sums of each row

        // Use nested loops to iterate through the 2D array and calculate the sum of each row

        // Store the sums in the new array

        // Print the values of the new array
    }
}
