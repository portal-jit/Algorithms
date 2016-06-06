package com.bose.leetcode;

/**
 * Created by arijitbose on 5/19/16.
 */
public class Solution4 {


    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode current = head;
        ListNode even = head.next;
        ListNode even_head = even;
        ListNode odd = head;
        ListNode odd_head = head;

        while(odd != null && even != null){

           // odd = current;
            odd.next = even.next;
            if(odd.next != null)
                odd = odd.next;
            else{
                even.next = odd.next;
                break;
            }

            even.next = odd.next;
            even = even.next;

        }


        odd.next = even_head;

        return odd_head;
    }

    public static void main(String[] args) {

        Solution4 sol = new Solution4();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);


        node1.next = node2; node2.next = node3; node3.next = node4;
        node4.next = node5; node5.next = node6; node6.next = node7;
        node7.next = null;

        sol.oddEvenList(node1);
    }


}
     class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }