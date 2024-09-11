package org.example.e141;

public class E141AccessModifiers {

public int maxValue(int[]nums){
    int max=0;
    for(int n:nums){
        if(n>max){
            max=n;
        }

    }System.out.println(max);
    return max;
}






    public static void main(String[] args) {
        E141AccessModifiers obj=new E141AccessModifiers();
        int[] numbers={1,5,22,3,7};
        obj.maxValue(numbers);
    }
}
