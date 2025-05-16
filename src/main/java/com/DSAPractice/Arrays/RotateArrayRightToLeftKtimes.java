package com.DSAPractice.Arrays;

import java.util.Arrays;

public class RotateArrayRightToLeftKtimes {


    //Optimised Approach force with time complexity O(N)
    static int [] rotateRightOptimisedApproach(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle k > n


            // Reverse full array
            reverse(arr, 0, n - 1);
            // Reverse first k elements
            reverse(arr, 0, k - 1);
            // Reverse remaining n-k elements
            reverse(arr, k, n - 1);


        return arr;
    }

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
    //Brute force with time complexity O(N*rotateValue)
    static int[] RotateArrayRightToLeftKtimestBruteForce(int rotateValue,int[] n)
    {


        for (int i=0;i<rotateValue;i++)
        {
            int temp=n[0];


            for (int j=0;j<n.length-1;j++)
            {

                n[j]=n[j+1];
            }
            n[n.length-1]=temp;


        }
        return n;
    }

    public static void main (String[] args)
    {
        int rotateValue=3;
        int[] n = new int[] {2, 7, 11, 15,3};
       // n=RotateArrayRightToLeftKtimestBruteForce(rotateValue,n);
        System.out.println("Reverse Array before "+ Arrays.toString(n));
        n=rotateRightOptimisedApproach(n,rotateValue);

        System.out.println("Reverse Array "+ Arrays.toString(n));


    }}
