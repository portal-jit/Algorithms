package com.bose.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by arijitbose on 5/18/16.
 */
public class Solution1 {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(toObject(nums1)));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(toObject(nums2)));

        ArrayList<Integer> list = new ArrayList<Integer>();
        int index = 0;

        for(Integer element : set2){
            if(set1.contains(element)){
                list.add(element);

            }
        }

        Integer[] array = new Integer[list.size()];
        list.toArray(array); // fill the array

        return toPrimitive(array);

    }

    public int[] toPrimitive(Integer[] intArray) {

        int[] result = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            result[i] = intArray[i].intValue();
        }
        return result;

    }

    public static Integer[] toObject(int[] intArray) {

        Integer[] result = new Integer[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            result[i] = Integer.valueOf(intArray[i]);
        }
        return result;

    }

    public static void main(String[] args){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        Solution1 sol = new Solution1();
        int[] result = sol.intersection(nums1, nums2);

        for(int i = 0; i < result.length-1;i++)
            System.out.println(result[i] + " ");

    }
}
