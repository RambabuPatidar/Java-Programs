package com.LinkedList.LinkedListQuestions;

// Reversing the liked list;
// Check the palindromic linked list;

public class ReverseLL extends AnLLTemp {
    public static void main(String[] args) {
        AnLLTemp list = new AnLLTemp();
        list.insertAtHead(12);
        list.insertAtTail(13);
        list.insertAtTail(14);
        list.insertAtTail(15);

        list.display();
        reverse();
        list.display();

    }

    public static void reverse() {
        Node node = head;
        Node prev = null;
        Node next;

        while (node != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        head = prev;
    }
    public static void reverseRec() {
        head = reverseRec(head);
    }
    private static Node reverseRec(Node node) {
        if (node.next == null) {
            return node;
        }

        Node headNode = reverseRec(node.next);
        Node temp = node.next;
        temp.next = node;
        node.next = null;
        return headNode;
    }

}
