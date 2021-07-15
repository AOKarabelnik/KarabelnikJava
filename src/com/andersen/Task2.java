package com.andersen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static void checkName() throws IOException {
        String defaulName = "Вячеслав";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name :");
        String name = reader.readLine();
        if (name.equals(defaulName)){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
