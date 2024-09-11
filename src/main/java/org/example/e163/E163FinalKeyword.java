package org.example.e163;

public class E163FinalKeyword {

    public static void main(String[] args){

        //creating object of class
        StringManipulator stringManipulator=new StringManipulator("hello");

        //calling reverseString method
        stringManipulator.reverseString();

        //creating object of ArrayManipulator class
        ArrayManipulator obj=new ArrayManipulator();

        //calling the method avgElements
        System.out.println(obj.avgElements(new int[]{3, 4, 5, 6, 6}));



    }

}

class StringManipulator{

    //declaring variable
    private String str;

    //Initializing variable through constructor
    public StringManipulator(String str){
        this.str=str;
    }
//creating Reverse String Method
    final void reverseString(){
         StringBuilder newSb=new StringBuilder(str);
         StringBuilder finalSb=newSb.reverse();
        System.out.println(finalSb);


    }
}

class ArrayManipulator{

    //creating Final Method that calculates average
final public double avgElements (int[] arrNum){
    int sum=0;
    for(int n:arrNum){
        sum+=n;
    }
    double dSum=sum;
    double dDiv=dSum/ arrNum.length;
    return dDiv;
}

    }





