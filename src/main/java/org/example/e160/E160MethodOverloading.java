package org.example.e160;

public class E160MethodOverloading {


    public static void main(String[] strings) {
    }
}


class Bankaccount{

    public static void main(String[] args) {
        Bankaccount b=new Bankaccount();
        b.displayInfo();
        b.displayInfo(5000);
        Bankaccount.displayBankInfo();
        Bankaccount.displayBankInfo(20);
    }

    //creating private Method 1
    private void displayInfo(){
        System.out.println("private displayInfo method");
    }

    //creating private Method 2
    private void displayInfo(int balance){
        System.out.println("private displayInfo method with balance: "+balance);
    }

    //creating static Method 1
    static void displayBankInfo(){
        System.out.println("static method without parameter");
    }

    //creating static Method 2
    static void displayBankInfo(int branches){
        System.out.println("static method with int parameter: "+branches);
    }
}

