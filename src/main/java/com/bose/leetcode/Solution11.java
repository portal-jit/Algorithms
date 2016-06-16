package com.bose.leetcode;

/**
 * Created by arijitbose on 6/11/16.
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand. (i.e., 0 1 2 4 5 6 7 8 might become 4 5 6 7 8 0 1 2).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 */
public class Solution11 {


    public int search(int[] nums, int target){

        return binarySearch(nums, 0, nums.length-1, target);
    }

    public int binarySearch(int[] nums, int start, int end, int target){

        if(start > end)
            return -1;

        int mid = start + (end - start)/2 ;
        if(nums[mid] == target)
            return target;

        if(nums[start] <= nums[mid]){
            if(target < nums[mid] && nums[start] <= target)
                return binarySearch(nums, start, mid-1, target);
            else
                return binarySearch(nums, mid+1, end, target);

        }else{
            if(nums[mid] < target && nums[end] >= target)
                return binarySearch(nums, mid+1, end, target);
            else
                return binarySearch(nums, start, mid-1, target);
        }

    }

    public static void main(String[] args) {

        Solution11 sol = new Solution11();
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int foundNumber = sol.search(nums, 5);
        System.out.println("Found Number: " + foundNumber);
    }


}
