package org.example.e162;

public class E162MethodOverriding {
    public static void main(String[] args) {
Cat c=new Cat("Cat");
        Kitten1 k1=new Kitten1("k1");
        Kitten2 k2=new Kitten2("k2");
        Kitten3 k3=new Kitten3("k3");

        Animal[] arr={c,k1,k2,k3};
        for (int i = 0; i < arr.length; i++) {
            Animal a=arr[i];
            a.eat();
            a.sleep();
        }
        c.makeSound();


    }
}


class Animal{

    //declaring instance variable
    private String type;

    //Create a constructor
    public Animal(String type){
        this.type=type;
    }

    //Create Public Method
    public void eat(){
        System.out.println("I am an animal eating");
    }

    //Create Protected Method
    protected void sleep(){
        System.out.println("I am an animal sleeping");
    }

    //Create Default Method
    void makeSound(){
        System.out.println("I am an animal making sound");
    }

    //Create Private Method
    private void roam(){
        System.out.println("I am an animal roaming");
    }
}

class Cat extends Animal{

//creating Constructor that calls parent constructor
    public Cat(String type) {
        super(type);
    }

    //Overriding Protected Sleep Method
    protected void sleep(){
        System.out.println("Cat sleeps a lot");
    }
    //Overriding Default makeSound Method
    void makeSound(){
        System.out.println("Cat makes a sound");
    }
    //Create Public Eat Method
    public void eat(){
        System.out.println("Cat eats");
    }
}

class Kitten1 extends Cat{
//creating Constructor matching super
    public Kitten1(String type) {
        super(type);
    }
    //Overriding Public Eat Method
    public void eat(){
        System.out.println("kitten1 eats milk");
    }
    //Overriding Protected Sleep Method
    protected void sleep(){
        System.out.println("kitten1 sleeps a lot");
    }
}

class Kitten2 extends Cat{
//creating Constructor matching super
    public Kitten2(String type) {
        super(type);
    }
    //Overriding Public Eat Method
    public void eat(){
        System.out.println("kitten2 eats snacks");
    }
    protected void sleep(){
        System.out.println("kitten2 sleeps a lot");
    }
}

class Kitten3 extends Cat{
//creating Constructor matching super
    public Kitten3(String type) {
        super(type);
    }
    //Overriding Public Eat Method
    public void eat(){
        System.out.println("kitten3 eats everything");
    }
    protected void sleep(){
        System.out.println("kitten3 sleeps a lot");
    }
}