package com.bose.leetcode;

/**
 * Created by arijitbose on 6/11/16.
 *
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n). If the target is not found in the array, return [-1, -1].
 * For example, given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4].
 *
 */
public class Solution13 {

    public int[] searchRange(int[] nums, int target){

        if(nums == null && nums.length == 0)
            return null;

        int[] arr = binarySearch(nums, target, 0 , nums.length - 1);

        return arr;
    }


    public int[] binarySearch(int[] nums, int target, int start, int end){

        if(start > end)
            return new int[] {-1,-1};

        int mid = start + (end - start)/2;
        int left = 0; int right = 0;

        if(nums[mid] == target){
            left = mid; right = mid;
            while((left-1) >= start && nums[left-1] == target)
                left--;
            while(right+1 <= end && nums[right+1] == target )
                right++;

            return new int[]{left, right};
        }

        if(nums[mid] < target)
             return binarySearch(nums, target, mid + 1, end);
        else
            return binarySearch(nums, target, start, mid - 1);


    }

    public static void main(String[] args) {

        Solution13 sol = new Solution13();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] arr = sol.searchRange(nums, 10);

        System.out.println("{ "+ arr[0] + ", " + arr[1] + " }");

    }

}
