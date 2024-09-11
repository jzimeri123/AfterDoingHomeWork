package org.example.e135;

public class E135StaticKeyword {
static String surround(String s, char search_term){
String newS="";

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i)==search_term){
            newS+="("+search_term+")";
        }else {
            newS+=s.charAt(i);
        }
    }
    System.out.println(newS);
    return s;
}
  
    public static void main(String[] args) {
        E135StaticKeyword.surround("abcabcabc",'c');
        E135StaticKeyword.surround("technology",'o');
    }
}

