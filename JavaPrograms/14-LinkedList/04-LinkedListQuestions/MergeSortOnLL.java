package com.LinkedList.LinkedListQuestions;

public class MergeSortOnLL {
    private Node head;

    public MergeSortOnLL() {
    }

    private Node mergeSortedList(Node first, Node second) {
        Node f = first;
        Node s = second;
        MergeSortOnLL newList = new MergeSortOnLL();
        while (f != null && s != null) {
            if (f.value < s.value) {
                newList.insert(f.value);
                f = f.next;
            } else {
                newList.insert(s.value);
                s = s.next;
            }
        }
        while (f != null ) {
            newList.insert(f.value);
            f = f.next;
        }
        while (s != null) {
            newList.insert(s.value);
            s = s.next;
        }
        return newList.head;
    }
    public void mergeSort() {
        head = mergeSort(head);
    }
    private Node mergeSort(Node head) {
        if ( head == null || head.next == null) {
            return head;
        }

        Node mid = findMiddle(head);
        // we can put these two line in code in findMiddle also
        Node midNode = mid.next;
        mid.next = null;
        Node head1 = mergeSort(head);
        Node head2 = mergeSort(midNode);
        return mergeSortedList(head1, head2);
    }

    private static Node findMiddle(Node head) {
        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr.next != null && fastPtr.next.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }

        return slowPtr;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
    }

    public void display () {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("End");
    }
    private class Node {
        private int value;
        private Node next;

        public Node (int value){
            this.value = value;
        }

        public Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        MergeSortOnLL list = new MergeSortOnLL();

        list.insert(4);
        list.insert(7);
        list.insert(10);
        list.insert(2);
        list.insert(3);
        list.insert(1);
        list.insert(5);
        list.display();
        list.mergeSort();
        list.display();
    }
}
