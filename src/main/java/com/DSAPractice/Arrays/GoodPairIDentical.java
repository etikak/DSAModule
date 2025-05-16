package com.DSAPractice.Arrays;

import java.util.Arrays;

public class GoodPairIDentical {
    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i]==nums[j])
                {
                    count++;
                }
            }
        }
        return count;

    }
    public static void main (String[] args) {
        int rotateValue = 3;
        int[] n = new int[]{2, 7, 11, 15, 3,3};
        int result=numIdenticalPairs(n);
        System.out.println("Identical values as good pair in array "+ result);
    }
}
