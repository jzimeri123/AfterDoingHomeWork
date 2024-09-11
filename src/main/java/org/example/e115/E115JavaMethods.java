package org.example.e115;

public class E115JavaMethods {
    public static void main(String[] args) {

        E115JavaMethods s=new E115JavaMethods();
        s.upperCase("test");
        // Call the convertToUpper method and print the result

    }

    public void upperCase(String word){
        String upper=word.toUpperCase();
        System.out.println(upper);

    }


    // Create method convertToUpper with a string parameter
    // Inside the method, convert the string to uppercase using toUpperCase method
    // Return the new uppercase string
}
