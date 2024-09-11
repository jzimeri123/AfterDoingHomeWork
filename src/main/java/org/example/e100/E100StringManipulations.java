package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("In: ");
        String word= input.next();

        String wordReverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
            wordReverse=wordReverse+word.charAt(i);

        }
        System.out.println(wordReverse);


    }
}
