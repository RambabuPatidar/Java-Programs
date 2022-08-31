package com.LinkedList.LinkedListQuestions;

public class ReversePartOfLL extends AnLLTemp {
    public static void main(String[] args) {
        AnLLTemp list = new AnLLTemp();
        list.insertAtTail(2);
        list.insertAtHead(1);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.insertAtTail(6);

        list.display();

        reversePart(1,2);
        list.display();
    }

    public static void reversePart(int f, int l) {
        head = reversePart(head, f, l);
    }

    public static Node reversePart(Node head, int f, int l) {
        if ( f == l) {
            return head;
        }

        Node node = head;
        Node preNode = null;
        int k = f;
        while (k != 1){
            preNode = node;
            node = node.next;
            k--;
        }
        Node prev = null;
        Node next = node.next;
        int i = l - f + 1;
        while (i  != 0) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
            i--;
        }
        if ( preNode == null) {
            head.next = next;
            head = prev;
        } else {
            preNode.next.next = next;
            preNode.next = prev;
        }
        return head;
    }

    public static int size() {
        Node node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}
