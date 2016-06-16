package com.bose.leetcode;

/**
 * Created by arijitbose on 6/12/16.
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * For example, given 1->1->1->2->3, return 2->3.
 */

public class Solution16 {

    public LLNode deleteDuplicates(LLNode head){

        LLNode current = head;
        LLNode node = current;
        LLNode dupNode = new LLNode(0);
        dupNode.next = node;

        while(node != null && node.next != null){

            if(node.number == node.next.number) {
                int dup = node.number;

                while (node.next != null && node.next.number == dup)
                    node.next = node.next.next;
            }else {
                node = dupNode.next;

            }
        }

        return node;
    }

    public LLNode deleteDuplicate(LLNode head){

        LLNode current = head;
        LLNode prev = head;
        LLNode tmp = null;

        while(current != null){

            prev = current;
            if(current.number != current.next.number){
                while(current.next != null && current.number == current.next.number){
                    current = current.next.next;
                }

            }else{

            }

        }

        return null;
    }

    public void displayList(LLNode head){

        while(head != null){
            System.out.print(head.number + "-> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Solution16 sol = new Solution16();
        LLNode node1 = new LLNode(1);
        LLNode node2 = new LLNode(1);
        LLNode node3 = new LLNode(1);
        LLNode node4 = new LLNode(2);
        LLNode node5 = new LLNode(3);

        node1.next = node2; node2.next = node3;
        node3.next = node4; node4.next = node5;
        node5.next = null;

        LLNode head = sol.deleteDuplicates(node1);

        sol.deleteDuplicates(head);

    }
}
