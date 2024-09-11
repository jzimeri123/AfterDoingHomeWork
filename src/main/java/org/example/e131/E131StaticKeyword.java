package org.example.e131;

public class E131StaticKeyword {

    public static String thirdLetter(String s){
        String newString="";
        for (int i = 0; i < s.length(); i=i+3) {
            newString=newString+s.charAt(i);
        }
        System.out.println(newString);
        return newString;
    }


    public static void main(String[] args) {
        E131StaticKeyword.thirdLetter("hello there");
        E131StaticKeyword.thirdLetter("technology");
    }
}
