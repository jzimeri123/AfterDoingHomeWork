package org.example.e139;
public class E139AccessModifiers {

    public String replaceSpaces(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newStr += '_';
            } else {
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
        return newStr;
    }


    public static void main(String[] args) {
E139AccessModifiers obj=new E139AccessModifiers();
        obj.replaceSpaces("hello world");
        obj.replaceSpaces("java is fun");
        obj.replaceSpaces("i love coding");
    }







}

