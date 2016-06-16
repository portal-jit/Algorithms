package com.bose.leetcode;

/**
 * Created by arijitbose on 6/11/16.
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class Solution12 {

    public String longestCommonPrefix(String[] strings){

        if(strings.length == 0 || strings == null)
            return "";
        if(strings.length == 1)
            return strings[0];

        int minLength = strings.length;

        for(String str : strings){
            if(minLength > str.length())
                minLength = str.length();
        }

        for(int i = 0; i < minLength; i++){
            for(int j = 0; j < strings.length-1; j++){
                String s1 = strings[j];
                String s2 =  strings[j+1];

                if(s1.charAt(i) != s2.charAt(i))
                    return strings[j].substring(0, i);
            }
        }

        return strings[0].substring(0, minLength);
    }

    public static void main(String[] args) {

        Solution12 sol = new Solution12();
        String[] strings = new String[]{"pre", "preamble", "preauth", "prehistoric", "preach", "preacher", "predator"};
        String prefix = sol.longestCommonPrefix(strings);

        System.out.println(prefix);

    }
}
