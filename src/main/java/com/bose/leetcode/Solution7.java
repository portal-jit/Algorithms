package com.bose.leetcode;

import java.util.*;

/**
 * Created by arijitbose on 6/5/16.
 * Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:

 Only one letter can be changed at a time
 Each intermediate word must exist in the word list
 For example,

 Given:
 beginWord = "hit"
 endWord = "cog"
 wordList = ["hot","dot","dog","lot","log"]
 As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 return its length 5.

 Note:
 Return 0 if there is no such transformation sequence.
 All words have the same length.
 */
public class Solution7 {

    public int ladderLength(String beginWord, String endWord, Set<String> wordDict){

        if(beginWord.equalsIgnoreCase(endWord))
            return 0;

        Queue<WordNode> queue = new LinkedList<WordNode>();
        int numsteps = 0;
        queue.add(new WordNode(beginWord, 1));
        wordDict.add(endWord);

        while(!queue.isEmpty()) {

            WordNode node = queue.remove();
            String word =  node.getWord();
            int steps = node.getCount();

            numsteps =  steps;

            if(word.equalsIgnoreCase(endWord)){
                return steps;
            }

            char[] charArray = word.toCharArray();
            for(int i = 0; i < charArray.length; i++){
                for(char j = 'a'; j <= 'z'; j++){
                    char temp = charArray[i];
                    if(charArray[i] != j){

                        charArray[i] = j;
                    }

                    String newWord = new String(charArray);
                    if(wordDict.contains(newWord)){
                        queue.add(new WordNode(newWord, node.count+1));
                        //wordDict.remove(newWord);
                    }

                    charArray[i] = temp;
                }

            }

        }


        return -1;
    }


    public static void main(String[] args) {

        Solution7 sol =  new Solution7();
        Set<String> dict = new HashSet<String>();
        dict.addAll(Arrays.asList("hot","dot","dog","lot","log"));
        int step = sol.ladderLength("hit", "cog", dict);

        System.out.println();
    }

}

class WordNode{

    String word;
    int count;

    public WordNode(String word, int count){
        this.word = word;
        this.count = count;

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
}