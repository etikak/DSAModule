package com.DSAPractice.PrefixSum;


//TIME COMPLEXITY=O(N*Q)
public class BruteForceApproach {
     static void  printQuerySum(int[]A,int[][]Q)
     {
         for(int i=0;i<Q.length;i++)
         {
              int[] query= Q[i];
              int s= query[0];
              int e=query[1];
              int sum=0;
         for(int j=s;j<=e;j++)
         {
              sum=sum+A[j];
         }
              System.out.println("Sum "+sum);
         }
     }

     public static void main (String[] args) {

          int[] n = new int[]{2, 7, 11, 15, 3,2, 7, 11, 15, 3,2, 7, 11, 15, 3};
          int[][] q = {
                  {1, 2},
                  {4, 5},
                  {7, 8}
          };
          printQuerySum(n,q);
     }
}
