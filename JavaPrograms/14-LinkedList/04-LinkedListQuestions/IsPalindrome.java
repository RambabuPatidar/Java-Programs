package com.LinkedList.LinkedListQuestions;

public class IsPalindrome {
    Node head;

    public IsPalindrome() {
    }

    public boolean isPalindrome () {
        return isPalindrome(head);
    }

    public boolean isPalindrome(Node head) {

        Node midNode = middleNode(head);
        Node reversedHead = reverseList(midNode);
        Node StoreReversedHead = reversedHead;
        Node node = head;
        while (node != null && reversedHead != null) {
            if( node.value != reversedHead.value) {
                break;
            }
            node = node.next;
            reversedHead = reversedHead.next;
        }

        reverseList(StoreReversedHead);

        return node == null || reversedHead == null;
    }
    public Node reverseList(Node head) {
        Node node = head;
        Node prev = null;
        Node next;

        while (node != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }

    public Node middleNode(Node head) {
        Node f = head;
        Node s = head;

        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }
        return s;
    }

    public void insert(int value) {
        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            return;
        }
        Node node = head;
        while( node.next != null) {
            node = node.next;
        }
        node.next = newNode;
    }

    public void display() {
        Node node = head;
        while( node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("End");
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        IsPalindrome list = new IsPalindrome();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
//        list.insert(1);

        boolean  ans = list.isPalindrome();

        System.out.println(ans);
    }
}