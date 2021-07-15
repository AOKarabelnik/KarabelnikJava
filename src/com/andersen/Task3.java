package com.andersen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static void checkArr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array length: ");
        int size = Integer.parseInt(reader.readLine());
        int[] arr = new int[size];
        int min = arr[0];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println("Array elements are multiples of 3 :" + arr[i]);
            }
        }
    }
}
