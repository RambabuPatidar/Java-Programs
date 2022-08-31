package com.LinkedList.LinkedListQuestions;

public class RemoveDup extends AnLLTemp {
    public static void main(String[] args) {
        AnLLTemp list = new AnLLTemp();
        list.insertAtHead(1);
        list.insertAtHead(1);
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(4);
        removeDupRec();
        list.display();
    }
    public static void removeDuplicate () {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
            }
            else {
                node = node.next;
            }
        }
    }
    public static void removeDupRec () {
        head = removeDupRec(head);
    }
    private static Node removeDupRec (Node node) {
        if (node.next == null) {
            return node;
        }

        Node temp = removeDupRec(node.next);

        if (node.value == temp.value) {
            return temp;
        } else {
            node.next = temp;
            return node;
        }
    }
}
