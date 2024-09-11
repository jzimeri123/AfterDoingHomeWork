package org.example.e120;

public class E120Variables {
    int year;
    String schoolName;
    int batchNumber;

    // Declare 3 instance variables: year, school name, and batch number

    public static void main(String[] args) {
       E120Variables s=new E120Variables();
       s.batchNumber=6;
       s.schoolName="Syntax";
       s.year=2020;
        System.out.println("I am a student of batch "+s.batchNumber+" studying at "+s.schoolName+" in the year of "+s.year);

        // Access variables from the main method and assign specific values to them
        // Print values of your variables in the specified format
        //I am a student of batch 6 studying at Syntax in the year of 2020
    }
}
