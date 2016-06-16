package com.bose.leetcode;

/**
 * Created by arijitbose on 6/12/16.
 */
public class LLNode {

    int number;
    LLNode next;

    public LLNode(int number) {
        this.number = number;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LLNode getNext() {
        return next;
    }

    public void setNext(LLNode next) {
        this.next = next;
    }
}

