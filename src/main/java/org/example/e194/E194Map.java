package org.example.e194;

import java.util.HashMap;

public class E194Map {
    public static void main(String[] args) {
        HashMap<Integer,String> student=new HashMap<>();
        student.put(101,"John");
        student.put(102,"Emily");
        student.put(103,"Michael");
        student.put(104,"Sarah");
        student.put(105,"David");
        System.out.println("Student IDs:");
        student.forEach((x,y)->
                System.out.println("Student ID: "+x));
        System.out.println();
        System.out.println("Student Names:");
        student.forEach((x,y)->
                System.out.println("Student Name: "+y));
        System.out.println();
        System.out.println("Student Records:");
        student.forEach((x,y)->
                System.out.println("Student ID: "+x+", Student Name: "+y));

    }

}
