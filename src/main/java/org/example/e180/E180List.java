package org.example.e180;

import java.util.Collections;
import java.util.LinkedList;

public class E180List {
    public static void main(String[] args){
        LinkedList<Integer> ages=new LinkedList<>();
        ages.add(20);
        ages.add(25);
        ages.add(30);
        ages.add(35);
        ages.add(40);
        ages.add(45);
        ages.add(50);
        ages.add(55);
        ages.add(60);
        ages.add(65);
        ages.removeIf(x-> x<=25||x>60);
        Collections.sort(ages);
        System.out.println("Remaining ages: "+ages);
        int sum=0;
        for (int i = 0; i < ages.size(); i++) {
            sum=sum+ages.get(i);
        }
        int avg=sum/ages.size();
        String formattedNumber = String.format("%.1f", (float) avg);
        System.out.println("Average age: "+formattedNumber);
    }

}
