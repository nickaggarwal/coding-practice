package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKLists {
    public static void main(String args[]) {
        int[] nums = { -2, -1, 2, 1 };
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return Integer.compare(o1.val, o2.val);
            }
        });

        ListNode head = null, cur = null;
        for(ListNode l: lists){
            pq.offer(l);
        }

        while(!pq.isEmpty()){
            if (head == null){
                cur = head = pq.poll();
            } else {
                cur.next = pq.poll();
                cur = cur.next ;
            }
            if(cur.next != null){
                pq.offer(cur.next);
            }
        }

        return head;
    }
}
