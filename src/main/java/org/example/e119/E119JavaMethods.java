package org.example.e119;

public class E119JavaMethods {


   public static String censorLetter(String a, char b){
       String changed="";
       changed=a.replace(b,'*');
       return changed;

   }

    public static void main(String[] args) {
        // Students will write the code here.
        System.out.println(censorLetter("trick or treat",'t'));

    }

}
