package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class num1 {
    public static void solution(int n) {
        int[] a = new int [n];
        Random r = new Random();
        printArr(a);
        // fill with random nums
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        Arrays.sort(a);
        printArr(a);
    }

    private static void printArr(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        solution(10);
    }
}
