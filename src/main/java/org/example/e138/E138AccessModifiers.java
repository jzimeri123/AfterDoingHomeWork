package org.example.e138;
public class E138AccessModifiers {

       public static void main(String[] args) {
AnotherClass obj=new AnotherClass();
obj.def();
obj.prot();
obj.pub();
       }
}

class AnotherClass{

       private void priv(){
              System.out.println("private");
       }

       void def(){
              System.out.println("default");
       }

       protected void prot(){
              System.out.println("protected");
       }
       public void pub(){
              System.out.println("public");
       }

}
