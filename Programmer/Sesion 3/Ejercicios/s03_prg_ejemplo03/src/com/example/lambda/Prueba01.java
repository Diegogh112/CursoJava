package com.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class Prueba01 {
    public static void main(String[] args) {

        List<Person> lista = Person.createShortList();

        for(Person p:lista) {
            System.out.println(p.toString());
        }

    }
}
