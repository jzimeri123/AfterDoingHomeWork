package org.example.e54;

public class E54DoWhileLoop {
    public static void main(String[] args) {

        int counter=10;
        do {
            System.out.println(counter);
            counter--;
            if (counter<1){
                System.out.println("Countdown complete!");
            }
        }while (counter>0);
    }
}
