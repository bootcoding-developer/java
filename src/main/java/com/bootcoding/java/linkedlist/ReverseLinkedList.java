package com.bootcoding.java.linkedlist;

import com.bootcoding.java.linkedlist.Node;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node head = createDummyLinkedList();
        printLinkedList(head);
        Node node = reverse(head);
        printLinkedList(node);
    }

    private static Node reverse(Node head) {

        Node current = head;
        Node next = null;
        Node prev = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


    private static void printLinkedList(Node head) {
        Node temp = head;
        System.out.println();
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    private static Node createDummyLinkedList() { 
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(40);

        Node head = firstNode; // 10
        head.next = secondNode; // 10 -> 20
        secondNode.next=thirdNode; // 10 -> 20 -> 30
        thirdNode.next=fourthNode; // 10 -> 20 -> 30 -> 40
        return head; // 10 (starting node)
    }
}
