package org.example.e133;

public class E133StaticKeyword {
    static String countA(String s){
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'|| s.charAt(i)=='A'){
                sum+=1;
            }

        }System.out.println(sum);
        return s;

    }


    public static void main(String[] args) {
        E133StaticKeyword.countA("aaa");
        E133StaticKeyword.countA("aaBBdf8k3AAadnklA");
    }
}

