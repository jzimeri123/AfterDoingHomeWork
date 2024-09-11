package org.example.e128;

public class E128StaticKeyword {

    public static String mixString(String s1, String s2){
        StringBuilder mix=new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            mix.append(s1.charAt(i));
            mix.append(s2.charAt(i));
        }
        return mix.toString();
    }


    public static void main(String[] args) {

String s1="12345";
String s2="abcde";
        System.out.println(mixString(s1, s2));

    }

}