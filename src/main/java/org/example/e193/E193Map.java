package org.example.e193;


import java.util.HashMap;

public class E193Map {

    public static void main(String[] args) {
        HashMap<Integer,String> book=new HashMap<>();
        book.put(101,"The Catcher in the Rye");
        book.put(102,"To Kill a Mockingbird");
        book.put(103,"1984");
        book.put(104,"The Great Gatsby");
        book.put(105,"Moby Dick");
        System.out.println("Initial number of books in catalog: "+book.size());
        System.out.println("Is the catalog empty? "+book.isEmpty());
        System.out.println("Is book with ID 102 available? "+book.containsValue("1984"));
        System.out.println("Is the book \"1984\" available? "+book.containsValue("1984"));

        System.out.println("Updated catalog after removing ID 105:");
        book.remove(105);
        book.forEach((x,y)->
                System.out.println(x+": "+y));
        book.clear();

        System.out.println("Is the catalog empty after clearing? "+book.isEmpty());
    }

}
