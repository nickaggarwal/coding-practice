package com.company;

public class SortedMerge {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");
        Node list1  = new Node(6);
        list1.next = new Node(8);
        list1.next.next = new Node(15);
        list1.next.next.next = new Node(20);
        Node list2 = new Node(5);
        list2.next = new Node(15);
        list2.next.next = new Node(30);
        list2.next.next.next = new Node(40);

        Node res = sortedMerge(list1, list2);

        while (res !=  null)
        {
            System.out.println(" "+res.data);
            res = res.next;
        }
    }

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node head;

    static Node sortedMerge(Node a , Node b)
    {
        Node result = null ;
        if( a == null)
            return b;
        if(b==null)
            return a;

        if( a.data > b.data) {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        else {
            result = a ;
            result.next = sortedMerge(a.next, b);
        }
        return result ;
    }
}
