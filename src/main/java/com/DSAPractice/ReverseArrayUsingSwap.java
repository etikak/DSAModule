package com.DSAPractice;

import java.util.Arrays;

public class ReverseArrayUsingSwap {

    static int[] swap(int[] A,int i, int j)
    {
        int temp=A[j];
        A[j]=A[i];
        A[i]=temp;
        return A;
    }

    public static void main (String[] args)
    {
        int[] n = new int[] {2, 7, 11, 15,3};
        int i=0;
        int j=n.length-1;
        while (i<j)
        {
            swap(n,i,j);
            i++;
            j--;
        }
        System.out.println("Reverse Array "+ Arrays.toString(n));
    }
}
