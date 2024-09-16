package org.example.e195;


import java.util.*;

public class E195Map {

    public static void main(String[] args) {
        Map<String,List<String>> subjectStudent=new HashMap<>();

        List<String> mathematics=new ArrayList<>();
        mathematics.add("Alice");
        mathematics.add("Bob");

        List<String> science=new ArrayList<>();
        science.add("Charlie");
        science.add("David");

        List<String> history=new ArrayList<>();
        history.add("Eve");
        history.add("Frank");

       subjectStudent.put("Mathematics",mathematics);
       subjectStudent.put("Science",science);
       subjectStudent.put("History",history);

        System.out.println("From Map (Students by Subject):");
     subjectStudent.forEach((x,y)->
             System.out.println("Subject: "+x+" Students: "+y));




    }
    }
