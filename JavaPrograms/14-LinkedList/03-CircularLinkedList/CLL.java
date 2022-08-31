package com.LinkedList.CircularLinkedList;

public class CLL {
    private Node head;
    public CLL() {

    }

    public void insertAtHead (int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        newNode.next = head;
        Node lastNode = lastNode();
        lastNode.next = newNode;
        head  = newNode;
    }

    public void insertAtTail (int value) {
        Node newNode = new Node(value);
        Node node = lastNode();
        if (node == null) {
            insertAtHead(value);
            return;
        }
        node.next = newNode;
        newNode.next = head;
    }

    public void insertInBetween (int index , int value) {
        index = (index % (size() - 1));
        if( index == 0) {
            insertAtHead(value);
            return;
        }
        if (index == size() - 1) {
            insertAtTail(value);
            return;
        }
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        Node newNode = new Node(value, node.next);
        node.next = newNode;
    }

    public int deleteAtHead () {
        if (head == null) {
            System.out.println("Nothing to delete");
            return -1;
        }
        int value = head.value;
        Node lastNode = lastNode();
        if (head.next != head) {
            head = head.next;
            lastNode.next = head;
        } else{
            head = null;
        }
        return value;
    }

    public int deleteAtTail () {
        Node node = head;
        if (node == null || node.next == head) {
            return deleteAtHead();
        }
        for (int i = 1; i <= size() - 2; i++) {
            node = node.next;
        }
        int value =  node.next.value;
        node.next = head;
        return value;
    }

    public int deleteInBetween (int index) {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        if (index == 0) {
            return deleteAtHead();
        }
        if (index == size() - 1) {
            return deleteAtTail();
        }
        Node node = head;

        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        int value = node.next.value;
        node.next = node.next.next;
        return value;
    }

    public Node lastNode () {
        Node node = head;
        if (node == null) {
            return null;
        }
        while (node.next != head) {
            node = node.next;
        }
        return node;
    }

    public int size () {
        Node node = head;
        if (head == null) {
            return 0;
        }
        int size = 0;
        do {
            size++;
            node = node.next;
        } while (node != head);
        return size;
    }

    public void display () {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node node = head;
        do {
            System.out.print(node.value + " -> ");
            node = node.next;
        } while (node != head);
        System.out.println("START");
    }
    private class Node {
        private int value;
        private Node next;

        public Node (int value) {
            this.value = value;
        }
        public Node (int value, Node node) {
            this.value = value;
            this.next = node;
        }
    }
}
