package org.example.e199;

public class E199Exceptions {

    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Trying to access an element...");
        try {
            System.out.println(array[6]);
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Error: Array index is out of bounds");
        }
        System.out.println("Program has finished");

    }

}

class ExceptionExample {
    public static void main(String[] args) {


    }
}