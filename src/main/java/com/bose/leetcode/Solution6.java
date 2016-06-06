package com.bose.leetcode;

/**
 * Created by arijitbose on 6/5/16.
 * Product of Array Except Self
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

 Solve it without division and in O(n).

 For example, given [1,2,3,4], return [24,12,8,6].
 */


public class Solution6 {

    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        result[nums.length-1] = 1;
        for(int i = nums.length-2; i >= 0; i--){
            result[i] = result[i+1] * nums[i+1];
        }

        int left = 1;
        for(int i = 0; i < nums.length; i++){
            result[i] = result[i] * left;
            left = left * nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Solution6 sol = new Solution6();
        int[] array = new int[4];
        array[0] = 1; array[1] = 2;
        array[2] = 3; array[3] = 4;

        int[] product = sol.productExceptSelf(array);

        for(int i = 0; i < product.length; i++)
            System.out.println(product[i]);
    }


}
