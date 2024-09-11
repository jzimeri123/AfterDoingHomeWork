package org.example.e148;

public class E148ThisKeyword {
    public static void main(String[] args){
ShoppingStore obj1=new ShoppingStore("Blanket",49.99,2);
ShoppingStore obj2=new ShoppingStore("Mattress",219.59,2);
obj1.itemTotalPrice();
obj2.itemTotalPrice();

double val1=obj1.itemTotalPriceResult();
double val2= obj2.itemTotalPriceResult();
        System.out.println("You purchased "+(val1+val2)+" Today");
    }
}


class ShoppingStore{

    private String item;
    private double price;
    private int quantity;


    //constructor
    public ShoppingStore(String item, double price, int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }

    //method
    public double itemTotalPriceResult(){
        return price*quantity;
    }
    public void itemTotalPrice(){
        System.out.println(item+" Total Value "+price*quantity);
    }


}