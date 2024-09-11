package org.example.e157;

public class E157MethodOverloading {


    public static void main(String[] args) {
        TransactionCalculator obj=new TransactionCalculator();
        obj.calculateProfit(100,20,30,10);
        obj.calculateProfit(80,30,20);
        obj.calculateProfit(50,30);
    }
}

class TransactionCalculator{

public void calculateProfit(int prof,int a, int b, int c){
  int result=prof-a-b-c;
    System.out.println(result);
}
    public void calculateProfit(int prof,int a, int b) {
        int result = prof - a - b;
        System.out.println(result);
    }
    public void calculateProfit(int prof,int a) {
        int result = prof - a;
        System.out.println(result);
    }



}

