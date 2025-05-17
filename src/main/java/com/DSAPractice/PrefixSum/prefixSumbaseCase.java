package com.DSAPractice.PrefixSum;

//TIME COMPLEXITY=O(N+Q)  SPACE COMPLEXITY=O(N)
public class prefixSumbaseCase {

    static void  printQuerySum(int[]A,int[][]Q)
    {
        long[] prefixSum=getPrefixSum(A);
        for(int i=0;i<Q.length;i++)
        {
            int[] query= Q[i];
            int s= query[0];
            int e=query[1];
            int sum=0;
            if(s==0)
            {
                System.out.println(prefixSum[e]);
            }
            else
            {
                System.out.println(prefixSum[e]-prefixSum[s-1]);
            }

        }
    }

    static long[]  getPrefixSum(int[] A)
    {
        long[] psa =new long[A.length];
        psa[0]=A[0];
        for(int i=1;i<A.length;i++)
        {
            psa[i]=psa[i-1]+A[i];
        }
        return psa;
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
