package com.bose.leetcode;

import java.util.*;

/**
 * Created by arijitbose on 6/8/16.
 */
public class Solution10 {
    public int result3SumClosest(int[] nums, int target){

        List<Integer> result =  new ArrayList<Integer>();

        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int closestSum = 0;

        for(int i = 0; i < nums.length; i++) {

            int j = i + 1;
            int k = nums.length - 1;
            int sum = 0; int diff = 0;


            if(i == 0 || nums[i] > nums[i-1]) {
                while (j < k) {

                    sum = nums[i] + nums[j] + nums[k];
                    diff = Math.abs(target - sum);
                    if(diff == 0){

                        result.addAll(Arrays.asList(nums[i], nums[j], nums[k]));
                        return sum;
                    }
                    else{

                        if(diff < minDiff) {
                            minDiff = Math.abs(diff);
                            closestSum = sum;
                            //result = new ArrayList<Integer>();
                            result.clear();
                            result.addAll(Arrays.asList(nums[i], nums[j], nums[k]));

                        }
                        if(sum > target) k--;
                        else j++;

                        }
                    }
                }

            }

        return closestSum;

    }

    public static void main(String[] args) {

        Solution10 sol = new Solution10();
        int result = sol.result3SumClosest(new int[]{1,1,-1,-1,3}, -1);

        System.out.println();
    }


}
//-1, 2, 1, -4
//1,1,1,0