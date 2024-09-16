package org.example.e175;

import java.util.ArrayList;

public class E175List {
    public static void main(String[] args){
        ArrayList<Integer> pq=new ArrayList<>();
        pq.add(111);
        pq.add(111);
        pq.add(111);
        pq.add(999);
        pq.add(999);
        pq.add(999);
        pq.forEach(x-> System.out.println(x));

    }

}
