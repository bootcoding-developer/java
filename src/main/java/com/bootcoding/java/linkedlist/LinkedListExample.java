package com.bootcoding.java.linkedlist;

public class LinkedListExample {

    public static void main(String[] args) {

        Node head = createDummyLinkedList();
        printLinkedList(head);
        deleteLastNode(head);
        printLinkedList(head);
        deleteFirstNode(head);
    }

    private static void deleteFirstNode(Node head) {
        System.out.println("Delete first node");
        head = head.next;
        printLinkedList(head);
    }

    private static void deleteLastNode(Node head) {
        Node temp = head;
        System.out.println("Delete Last Node");
        // identify last node
        // a node whose next node is null

        while(temp != null){
            if(temp.next.next == null){
                temp.next = null;
            }
            temp = temp.next;
        }
    }
















    private static void printLinkedList(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
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

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
