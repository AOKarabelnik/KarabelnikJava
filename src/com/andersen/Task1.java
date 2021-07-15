package com.andersen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void checkSeven() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number :");
        int number = Integer.parseInt(reader.readLine());
        if(number > 7){
            System.out.println("Привет");
        }
    }
}
