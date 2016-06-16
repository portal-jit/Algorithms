package com.bose.leetcode;

import java.util.*;

/**
 * Created by arijitbose on 6/6/16.
 * Given two words (start and end), and a dictionary, find all shortest transformation sequence(s) from start to end, such that:
 * 1) Only one letter can be changed at a time,
 * 2) Each intermediate word must exist in the dictionary.
 * For example, given: start = "hit", end = "cog", and dict = ["hot","dot","dog","lot","log"], return:
 *   [
    ["hit","hot","dot","dog","cog"],
    ["hit","hot","lot","log","cog"]
 *   ]

 */

public class Solution8 {

    /*public List<List<String>> findLadders(String start, String end, Set<String> dict){

        if(start.equalsIgnoreCase(end))
            return new ArrayList(Arrays.asList("start"));

        Queue<WordNodes> queue = new LinkedList<WordNodes>();
        dict.add(end);

        HashSet<String> unvisited = new HashSet<String>();
        HashSet<String> visited = new HashSet<String>();

        unvisited.addAll(dict);

        queue.add(new WordNodes(start,1,null));

        int preSteps = 0;
        int minSteps = 0;

        while(!queue.isEmpty()){

            WordNodes node = queue.remove();
            String word =  node.getWord();
            int steps = node.getCount();

            if(word.equalsIgnoreCase(end)){

                if(minSteps == 0){

                }


            }

        }

    }
*/
}


class WordNodes{

    String word;
    int count;
    String pre;

    public WordNodes(String word, int count, String pre){
        this.word = word;
        this.count = count;
        this.pre = pre;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPre() {
        return pre;
    }
}