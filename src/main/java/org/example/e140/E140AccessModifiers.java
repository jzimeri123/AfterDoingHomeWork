package org.example.e140;

public class E140AccessModifiers {


    private String maxLength (String [] words) {
        int max = 0;
        String maxWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max) {
                max = words[i].length();
                maxWord = words[i];
            }
        } System.out.println(maxWord);
        return maxWord;
    }
        public static void main (String[]args){
            E140AccessModifiers obj = new E140AccessModifiers();
            String[] array = {"this", "is", "a", "long", "word"};
            String[] array2={"java", "programming", "is", "fun"};
            obj.maxLength(array);
            obj.maxLength(array2);

        }


}
