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
    public void setCustomerName(String name){
        this.customerName=name;
    }
    public void setCustomerAge(int age){
        this.customerAge=age;
    }
}

class StoreManagement{
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setCustomerName("Mario");
        customer.setCustomerAge(32);
        System.out.println("Customer Name: "+customer.getCustomerName());;
        System.out.println("Customer Age: "+customer.getCustomerAge());
    }



}






