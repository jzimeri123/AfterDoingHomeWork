package org.example.e81;

public class E81Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] num = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
int sum=0;
        for (int i = 0; i < num.length ; i=i+2) {
            for (int j = 0; j < num[i].length; j=j+2) {
                sum=sum+num[i][j];
            }
        }
        System.out.println(sum);


        // Use nested loops to iterate through the 2D array and sum the elements that are on even indexes and even rows

        // Print the calculated sum
    }
}
