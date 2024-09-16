package org.example.e179;

import java.util.LinkedList;

public class E179List {

    public static void main(String[] args){
        LinkedList<Integer> numbers=new LinkedList<>();
        for (int i = 50; i <=100 ; i++) {
            numbers.add(i);
        }

        numbers.removeIf(x-> x%3!=0);
        System.out.println(numbers);
    }

}