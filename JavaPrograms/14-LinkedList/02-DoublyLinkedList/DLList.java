package com.LinkedList.DoublyLinkedList;

import com.LinkedList.SinglyLinkedList.LList;

public class DLList {
    private Node head;
    private Node tail;
    private int size;
    public DLList () {
        this.size = 0;
    }

    public void insertAtHead (int value) {
        Node newNode = new Node(value, null, head);
        if (head == null) {
            tail = newNode;
        } else{
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void insertAtTail (int value) {
        if(head == null) {
            insertAtHead(value);
            return;
        }
        Node newNode = new Node(value, tail, null);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertInBetween (int index, int value) {
        if (index == 0) {
            insertAtHead(value);
            return;
        }
        if (index == size -1 ) {
            insertAtTail(value);
            return;
        }
        Node prevNode = get(index);
        Node newNode = new Node(value, prevNode, prevNode.next);
        prevNode.next.prev = newNode;
        prevNode.next = newNode;
        size++;
    }

    public int deleteAtHead () {
        int value = head.value;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteAtTail () {
        if (size <= 1) {
            return deleteAtHead();
        }
        int value = tail.value;
        tail = tail.prev;
        tail.next = null;
        size--;
        return value;
    }

    public int deleteInBetween (int index) {
        if (index == 0) {
            return deleteAtHead();
        }
        if (index == size - 1) {
            return deleteAtTail();
        }

        Node prevNode = get(index - 1);
        int value = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        prevNode.next.prev = prevNode;
        size--;
        return value;
    }

    public void insertAfter (int value, int data) {
        Node node = findNode(value);

        if( node == null ) {
            System.out.println("Node doesn't exist");
            return;
        }
        size++;

        Node newNode = new Node(data);
        newNode.prev = node;
        newNode.next = node.next;
        if (node.next != null ) { // it can give as nullPointer exception
            node.next.prev = newNode;
        } else {
            tail = newNode;
        }
        node.next = newNode;
    }

    public void deleteNode (int value) {
        Node node = findNode(value);
        if( node == null) {
            System.out.println("Node does not exist");
            return;
        }
        if (node.prev == null) {
            head = node.next;
        } else {
            node.prev.next = node.next;
        }
        if (node.next == null) {
            tail = node.prev;
        } else{
            node.next.prev = node.prev;
        }
        size--;
    }

    public Node findNode (int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Node get (int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display () {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node temp = head;
        System.out.print("null <- ");
        while (temp.next != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println(temp.value + " -> null");
    }

    public void displayReverse () {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node temp = tail;
        System.out.print("null <- ");
        while (temp.prev != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.prev;
        }
        System.out.println(temp.value + " -> null");
    }

    private class Node{
        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
