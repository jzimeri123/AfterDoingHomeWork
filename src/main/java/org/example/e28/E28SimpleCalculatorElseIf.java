package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Declare a variable for operator and assign a value
        char operator = '*';

        // Declare two variables for numbers and assign values
        int num1 = 10;
        int num2 = 5;
        int sum=num1+num2;
        int sub=num1-num2;
        int mult=num1*num2;
        int div=num1/num2;


        // Perform the corresponding arithmetic operation
        if (operator == '+') {
            System.out.println("The sum is: "+sum);
        }else if (operator=='-'){
            System.out.println("The difference is: "+sub);
        }else if (operator=='*'){
            System.out.println("The product is: "+mult);
        }else if (operator=='/'){
            System.out.println("The quotient is: "+div);
        }
    }
}
