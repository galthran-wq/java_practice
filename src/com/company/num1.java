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

    public static int getArraySum(int[] a) {
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        return sum;
    }

    public static int getFactorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    private static void printArr(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        solution(10);
        num1Test.runTests();
    }
}


class num1Test {
    public static void testGetFactorial() {
        assert num1.getFactorial(3) == 6;
        assert num1.getFactorial(4) == 24;
    }

    public static void runTests() {
        testGetFactorial();
    }
}
