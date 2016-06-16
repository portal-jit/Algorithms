package com.bose.leetcode;

/**
 * Created by arijitbose on 6/11/16.
 */
public class Solution14 {

    public Node reverseList(Node head){

        if(head == null)
            return head;

        Node  p = head; Node q = null;
        Node temp = null;

        while(p != null){
            q = p.next;
            p.next = temp;
            temp = p;
            p = q;
        }

        head = temp;
        return head;
    }

    public boolean isPalindrome(Node start, Node end){

        while(start != null){

            if(start.number != end.number)
                return false;
            else{
                start = start.next;
                end = end.next;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Solution14 sol = new Solution14();
        Node node1 = new Node(4);
        Node node2 = new Node(2);
        Node node3 = new Node(1);
        Node node4 = new Node(2);
        Node node5 = new Node(4);

        node1.next = node2; node2.next = node3;
        node3.next = node4; node4.next = node5;
        node5.next = null;

        Node node = sol.reverseList(node1);
        sol.isPalindrome(node1, node);
        System.out.println("isPalindrome: " + sol.isPalindrome(node1, node));

    }
}

class Node{

    int number;
    Node next;

    public Node(int number) {
        this.number = number;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
