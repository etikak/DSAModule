package com.DSAPractice;

public class countFactors {

    static long countFactorsOptimised(long N)
    {
        long count=0;
        for(int i=1;i<=Math.sqrt(N) ;i++)
        {

            if(N%i==0)
            {
                System.out.println(i);
                if(i==N/i)
                {
                    count=count+1;
                }
                else
                {
                    count=count+2;
                }
            }

        }

        return count;

    }

    static long countFactorsOptimisedWithoutSqrt(long N)
    {
        long count=2;
        for(int i=2;i*i<=N ;i++)
        {

            if(N%i==0)
            {

                if(i==N/i)
                {
                    count=count+1;
                }
                else
                {
                    count=count+2;
                }
            }

        }

        return count;

    }
    public static void main (String[] args)
    {
        long n = 24;
        System.out.println("count for factor for number "+n+" :"+countFactorsOptimisedWithoutSqrt(n));
    }
}
