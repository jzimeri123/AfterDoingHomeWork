package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("In: ");
        String word= input.next();

        String newWord="";
        for (int i = 0; i <word.length() ; i=i+2) {
            newWord=newWord+word.charAt(i);
        }
        System.out.println(newWord);
    }
}
