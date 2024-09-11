package org.example.e80;

public class E80Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] num = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };

int count=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] < 0 && num[i][j] % 2 != 0) {
                    count++;
                }
                }
            }System.out.println(count);

        }
    }


// Use nested loops to iterate through the 2D array and count the elements that are both negative and odd

// Print the total count of elements that are both negative and odd