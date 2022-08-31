package com.LinkedList.LinkedListQuestions;

public class MiddleOfLL extends AnLLTemp {
    public static void main(String[] args) {
        AnLLTemp list = new AnLLTemp();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(4);
        list.insertAtHead(5);
        list.insertAtHead(6);

        Node middle = findMiddle(head);
        list.display();
        System.out.println(middle.value);
    }
    // this will return the middle in case of the Odd Element
    // and return the second middle when we have two mid element;
    private static Node findMiddle(Node head) {
        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }

        return slowPtr;
    }
}
