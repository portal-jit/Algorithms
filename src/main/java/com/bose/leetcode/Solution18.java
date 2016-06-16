package com.bose.leetcode;

/**
 * Created by arijitbose on 6/16/16.
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * For example, given 1->4->3->2->5->2 and x = 3, return 1->2->2->4->3->5.
 */
public class Solution18 {

    public LLNode partitionList(LLNode head, int val){

        LLNode current = head;
        LLNode prev =  new LLNode(0);
        prev.next = head;

        LLNode head_greater = new LLNode(0);
        LLNode nodes_greater = head_greater;

        while(current != null){
            if(current.number < val){
                current = current.next;
                prev = prev.next;
            }else{

                nodes_greater.next = current;
                nodes_greater = nodes_greater.next;

                prev.next = current.next;
                current = prev.next;

            }

        }

        nodes_greater.next = null;
        prev.next = head_greater.next;

        return head;
    }

    public void displayList(LLNode head){

        while(head != null){
            System.out.print(head.number + "-> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Solution18 sol = new Solution18();
        LLNode node1 = new LLNode(1);
        LLNode node2 = new LLNode(4);
        LLNode node3 = new LLNode(3);
        LLNode node4 = new LLNode(2);
        LLNode node5 = new LLNode(5);
        LLNode node6 = new LLNode(2);

        node1.next = node2; node2.next = node3;
        node3.next = node4; node4.next = node5;
        node5.next = node6; node6.next = null;

        sol.partitionList(node1, 3);
        sol.displayList(node1);
    }
}
