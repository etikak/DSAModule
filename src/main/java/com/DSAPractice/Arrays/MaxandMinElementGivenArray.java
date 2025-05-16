package com.DSAPractice.Arrays;

import java.util.Arrays;

public class MaxandMinElementGivenArray {
    public static int sumofmaxandMin(int[] A) {

        int N = A.length;

        // Initialize max and min with the first element
        int max = A[0];
        int min = A[0];

        // Iterate through the array to find max and min
        for (int i = 1; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            if (A[i] < min) {
                min = A[i];
            }
        }

        // Calculate the sum of max and min
        int sumOfMaxAndMin = max + min;

        return sumOfMaxAndMin;
    }

    public static void main (String[] args) {
        int rotateValue = 3;
        int[] n = new int[]{2, 7, 11, 15, 3};
        int result = sumofmaxandMin(n);
        System.out.println("Reverse Array before " + result);
    }
}
