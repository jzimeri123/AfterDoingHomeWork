package org.example.e94;

public class E94StringManipulations {
    public static void main(String[] args) {
        // Create a String variable named 'given' and assign the value "I love Java classes at Syntax" to it
        String given = "I love Java classes at Syntax";

        // Use the substring() method to retrieve the substring "classes at Syntax" and print it
String target1="classes";

        String newStr=given.substring(given.indexOf(target1));
        System.out.println(newStr);
        // Use the substring() method to retrieve the substring "I love Java" and print it
    String newStr2=given.substring(0,given.indexOf(target1)-1);
        System.out.println(newStr2);

    }
}
