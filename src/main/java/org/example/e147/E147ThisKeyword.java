package org.example.e147;

public class E147ThisKeyword {

    public static void main(String[] args) {
CarObject obj1=new CarObject("Toyota 2019",50000.0,50);
CarObject obj2=new CarObject("BMW 2019",10883.0,60);
obj1.carStockValue();
obj2.carStockValue();
    }
}

class CarObject{
    private String model;
    private double price;
    private int quantity;

    //constructor
    public CarObject(String model, double price, int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }

    //method
    public void carStockValue(){
        double total=price*quantity;
        System.out.println(model+" Stock Value "+total);
    }


}
