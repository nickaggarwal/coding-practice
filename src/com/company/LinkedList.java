package com.company;

public class LinkedList {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    Node reverse(Node node)
    {
        Node prev = null, next = null ;
        Node current = node ;
        while (current != null)
        {
            next = current.next;
            current.next = prev ;
            prev = current;
            current = next ;

        }

        return prev ;
    }
}
