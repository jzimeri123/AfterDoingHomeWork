package org.example.e117;

public class E117JavaMethods {
    public static void main(String[] args) {
        // Call the sumEvenToX method with various arguments to test the method
        E117JavaMethods sum=new E117JavaMethods();
        sum.sumEvenToX(5);
    }


    public void sumEvenToX(int x){
        int sum=0;
        for (int i = 0; i <=x ; i++) {
            if (i%2==0){
                sum=sum+i;
            }

        }
        System.out.println("sumEvenToX("+x+") ==> "+sum);
    }
    // Create method sumEvenToX with an integer parameter (x)
    // Inside the method, calculate the sum of even integers from 1 to x
    // Return the calculated sum
}
