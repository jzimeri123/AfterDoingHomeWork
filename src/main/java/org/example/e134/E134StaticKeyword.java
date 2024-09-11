package org.example.e134;

public class E134StaticKeyword {
    static String countVowels(String s){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count+=1;
            }
        }
        System.out.println(count);
        return s;
    }

    public static void main(String[] args) {
        E134StaticKeyword.countVowels("obama");
        E134StaticKeyword.countVowels("happy friday! i love weekends");
    }
}

