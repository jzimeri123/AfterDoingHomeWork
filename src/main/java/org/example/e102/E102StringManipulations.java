package org.example.e102;

import java.util.Scanner;

public class E102StringManipulations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("In:");
        String word=input.next();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }


    }
}
