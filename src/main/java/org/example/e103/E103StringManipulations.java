package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("In:");
        String word=input.next();

        String word1="";
        for (int i = 0; i < word.length() ; i++) {
            word1=word1+word.charAt(i)+" ";
        }
     String word2=word1.substring(0,word1.length()-1);
        System.out.println(word2);

    }
}
