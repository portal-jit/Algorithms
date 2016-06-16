package com.bose.leetcode;

/**
 * Created by arijitbose on 6/12/16.
 *
 * Given a singly linked list, group all odd nodes together followed by the even nodes.
 * Please note here we are talking about the node number and not the value in the nodes.
 * The program should run in O(1) space complexity and O(nodes) time complexity.
 */

public class Solution15 {

    public LLNode oddEvenList(LLNode head){

        LLNode even_head = head.next;
        LLNode odd = null;
        LLNode even =  null;
        int size = 1;

        if(head == null)
            return null;

        odd = head;

        if(head.next != null)
            even = head.next;

        while(odd != null && even != null){

            if(size % 2 == 1){
                odd.next = even.next;
                odd = odd.next;
            }else{
                even.next =  odd.next;
                even = even.next;
            }
            size++;
        }

        odd.next = even_head;

        return head;

    }

    public void displayList(LLNode head){

        while(head != null){
            System.out.print(head.number + "-> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public ListNode oddEvenList_Leetcode(ListNode head) {
        if(head == null)
            return head;

        ListNode result = head;
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode connectNode = head.next;

        while(p1 != null && p2 != null){
            ListNode t = p2.next;
            if(t == null)
                break;

            p1.next = p2.next;
            p1 = p1.next;

            p2.next = p1.next;
            p2 = p2.next;
        }

        p1.next = connectNode;

        return result;
    }

    public static void main(String[] args) {

        Solution15 sol = new Solution15();
        LLNode node1 = new LLNode(1);
        LLNode node2 = new LLNode(2);
        LLNode node3 = new LLNode(3);
        LLNode node4 = new LLNode(4);
        LLNode node5 = new LLNode(5);

        node1.next = node2; node2.next = node3;
        node3.next = node4; node4.next = node5;
        node5.next = null;

        sol.displayList(node1);

        sol.oddEvenList(node1);

        sol.displayList(node1);
    }
}

