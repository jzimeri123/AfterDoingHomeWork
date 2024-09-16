package org.example.e184;


import java.util.ArrayList;
import java.util.List;

public class E184List {
    public static void main(String[] args) {
        E184CountryList obj=new E184CountryList();
        List<String> country=new ArrayList<>();
        country.add("USA");
        country.add("Argentina");
        country.add("Kazakhstan");
        country.add("Australia");
        country.add("Pakistan");
        country.add("Russia");
        System.out.println(obj.removeCountriesStartingWithA(country));
    }
}

class E184CountryList{
    List<String> removeCountriesStartingWithA(List<String> a){
        a.removeIf(x->x.startsWith("A"));
        return a;
    }

}