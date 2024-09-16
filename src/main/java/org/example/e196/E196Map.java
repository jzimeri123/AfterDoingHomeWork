package org.example.e196;

import java.util.*;

public class E196Map {

    public static void main(String[] args) {
        ArrayList<String> hr=new ArrayList<>();
        hr.add("Alice");
        hr.add("Bob");

        ArrayList<String> it=new ArrayList<>();
        it.add("Charlie");
        it.add("David");
        it.add("Eve");

        ArrayList<String> finance=new ArrayList<>();
        finance.add("Frank");
        finance.add("Grace");

        Map<String,List<String>> department=new LinkedHashMap<>();
        department.put("HR",hr);
        department.put("IT",it);
        department.put("Finance",finance);

        department.forEach((x,y)->
                System.out.println("Department: "+x+" Employees: "+y));

    }
}
