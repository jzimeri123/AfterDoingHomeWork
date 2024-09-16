package org.example.e190;

import java.util.LinkedHashMap;

public class E190Map {
    public static void main(String[] args) {
        LinkedHashMap<String,String> address=new LinkedHashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("zip","22180");
        address.put("Country","United States");
        System.out.println("Address Details:");
        address.forEach((x,y)-> System.out.println(y));

    }
}
