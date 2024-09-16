package org.example.e192;

import java.util.TreeMap;

public class E192Map {
    public static void main(String[] args){
        TreeMap<String,String> products=new TreeMap<>();
        products.put("1 item","apple");
        products.put("2 item","banana");
        products.put("3 item","pear");
        products.put("4 item","tomato");
        products.put("5 item","mango");
        products.put("6 item","kiwi");
        products.forEach((x,y)->
                System.out.println("Key is "+x+" and value is "+y));

    }

}