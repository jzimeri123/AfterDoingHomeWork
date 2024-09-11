package org.example.e145;

public class E145ThisKeyword {

    public static void main(String[] args) {
Dog d1=new Dog("Tarzan",50.0);
d1.displayDetails();
Dog d2=new Dog("Lucy", 10);
d2.displayDetails();
    }

}

class Dog{
    private String dogName;
    private double dogWeight;
    static String dogBreed="Mutt";

    public Dog(String dogName, double dogWeight){
this.dogName=dogName;
this.dogWeight=dogWeight;
    }

    public void displayDetails(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }
}