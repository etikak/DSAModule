package com.DSAPractice;

import static com.DSAPractice.countFactors.countFactorsOptimisedWithoutSqrt;

public class checkPrimeOptimised {

    // Function to check whether a number is prime or not
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        // Check divisibility from 2 to n-1
        long countOfFactors=countFactorsOptimisedWithoutSqrt(n);
        if(countOfFactors>2)
        {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(isPrime(n));
    }
}