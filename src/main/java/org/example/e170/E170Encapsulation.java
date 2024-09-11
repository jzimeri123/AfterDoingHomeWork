package org.example.e170;

public class E170Encapsulation {
    public static void main(String[] args) {

    }
}

class Customer{
    private String customerName;
    private int customerAge;

    //getter methods
    public String getCustomerName(){
        return customerName;
    }
    public int getCustomerAge(){
        return customerAge;
    }

    //setter methods
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setCustomerAge(int customerAge){
        this.customerAge=customerAge;
    }
}

class StoreManagement{
    public static void main(String[] args) {
        Customer obj=new Customer();
        obj.setCustomerName("Mario");
        obj.setCustomerAge(32);
        System.out.println("Customer Name: "+obj.getCustomerName());;
        System.out.println("Customer Age: "+obj.getCustomerAge());
    }



}






