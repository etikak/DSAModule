package com.DSAPractice.Arrays;

import java.util.Arrays;

public class RotateArrayLeftToRightKtimes {


    //Brute force with time complexity O(N*rotateValue)
    static int[] rotateArrayLeftToRightBruteForce(int rotateValue,int[] n)
    {


        for (int i=0;i<rotateValue;i++)
        {
            int temp=n[n.length-1];


            for (int j=n.length-1;j>0;j--)
            {

                n[j]=n[j-1];
            }
            n[0]=temp;

        }
        return n;
    }

    public static void main (String[] args)
    {
        int rotateValue=3;
        int[] n = new int[] {2, 7, 11, 15,3};
        n=rotateArrayLeftToRightBruteForce(rotateValue,n);
        System.out.println("Reverse Array "+ Arrays.toString(n));

    }}
