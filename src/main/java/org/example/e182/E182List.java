package org.example.e182;


import java.util.LinkedList;

public class E182List {
    public static void main(String[] args) {
        LinkedList<Integer> primeNumbers=new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            if(isPrime(i)){
                primeNumbers.add(i);
            }


        }
        System.out.println(primeNumbers);

    }

public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}
}
