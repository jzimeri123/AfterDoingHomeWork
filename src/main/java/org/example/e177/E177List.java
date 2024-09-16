package org.example.e177;

import java.util.ArrayList;
import java.util.Scanner;

public class E177List {
    public static void main(String[] args){
ArrayList<String> messages=new ArrayList<>();
Scanner input=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            messages.add(input.nextLine());
        }
//since it is dynamic, the indexes change every time an item is reduced
        //so to remove 1st, 3rd and 5th item, the indexes change
        messages.remove(0);
        messages.remove(1);
        messages.remove(2);
        System.out.println("Remaining messages:");
        messages.forEach(x-> System.out.print(x+" "));

    }

}
