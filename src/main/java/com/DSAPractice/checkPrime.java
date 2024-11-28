package com.DSAPractice;
public class checkPrime {

    // Function to check whether a number is prime or not
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        // Check divisibility from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(isPrime(n));
    }
}