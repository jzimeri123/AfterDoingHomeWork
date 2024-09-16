package org.example.e185;

import java.util.HashSet;

public class E185Set {

    public static void main(String[] args) {
        HashSet<Integer> ids=new HashSet<>();
            ids.add(1001);
            ids.add(1002);
            ids.add(1001);
            ids.add(1003);
            ids.add(1002);
            ids.add(1004);
            ids.forEach(x-> System.out.println(x));

        }
}



