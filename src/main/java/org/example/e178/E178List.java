package org.example.e178;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class E178List {
    public static void main(String[] args) {

        ArrayList<String> groceryItems=new ArrayList<>();
        System.out.println("Enter 5 grocery items:");
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            groceryItems.add(input.nextLine());
        }
        LinkedHashSet<String> newGroceryItems=new LinkedHashSet<>(groceryItems);
        System.out.println("Unique grocery items:");
        newGroceryItems.forEach(x-> System.out.print(x+" "));
}
}

