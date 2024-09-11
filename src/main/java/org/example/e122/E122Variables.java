package org.example.e122;

public class E122Variables {
    // Declare 3 instance variables: name of the countryName, capital, and populationSize
    String countryName;
    String capital;
    int populationSize;

    // Create a method to display values of instance variables
public void display(){
    System.out.println("The capital of "+countryName+" is "+capital+" and population is "+populationSize);
}
    public static void main(String[] args) {
        E122Variables country1=new E122Variables();
        country1.countryName="USA";
        country1.capital="Washington DC";
        country1.populationSize=330000000;

        E122Variables country2 = new E122Variables();
        country2.countryName = "Kazakhstan";
        country2.capital = "Astana";
        country2.populationSize = 18500000;

        country1.display();
        country2.display();



//The capital of Kazakhstan is Astana and population is 18500000





        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Execute the method to display values for the first instance
        // Assign values to variables for the second instance
        // Execute the method to display values for the second instance
    }
}
