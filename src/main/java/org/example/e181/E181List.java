package org.example.e181;

import java.util.ArrayList;

public class E181List {
    public static void main(String[] args){
        ArrayList<Boolean> listA=new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

        ArrayList<Boolean> listB=new ArrayList(listA);
        listB.forEach(x-> System.out.println(x));
        }
    }
