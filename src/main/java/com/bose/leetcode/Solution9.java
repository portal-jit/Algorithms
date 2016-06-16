package com.bose.leetcode;

import java.util.*;

/**
 * Created by arijitbose on 6/7/16.
 * Given an array S of n integers, are there elements a, b, c in S such that
 * a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * {-1 0 1 2 -1 -4}
 * Sol: (-1, 0, 1)   (-1, -1, 2)    -1 -1 0 1 2 4
 */
public class Solution9 {

    public Set<List<Integer>> result3Sum(int[] nums){

        Set<List<Integer>> result =  new HashSet<List<Integer>>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {

            int j = i + 1;
            int k = nums.length - 1;
            int sum = 0;

            if(i == 0 || nums[i] > nums[i-1]) {

                while (j < k) {

                    sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        result.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k])));
                        j++;
                        k--;
                        //handle duplicate here
//                        while(j<k && nums[j]==nums[j-1])
//                            j++;
//                        while(j<k && nums[k]==nums[k+1])
//                            k--;
                    } else {
                        if (sum > 0) k--;
                        else j++;

                    }
                }
            }

        }

        return result;

    }

    public static void main(String[] args) {

        Solution9 sol = new Solution9();
        Set<List<Integer>> result = sol.result3Sum(new int[]{-1, 0, 1, 2, -1, 4});

        System.out.println();
    }

}
