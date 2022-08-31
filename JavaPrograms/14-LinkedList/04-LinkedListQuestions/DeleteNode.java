package com.LinkedList.LinkedListQuestions;

public class DeleteNode extends AnLLTemp {
    public static void main(String[] args) {
        AnLLTemp list = new AnLLTemp();
        list.insertAtHead(4);
        list.insertAtTail(7);
        list.insertAtTail(8);
        list.insertAtTail(12);
        deleteNode(8);
        list.display();
    }
    public static void deleteNode (int value) {
        head = deleteNode(head, value);
    }

    private static Node deleteNode (Node node, int value) {
        if (node == null) {
            System.out.println("Not found the element");
            return null;
        }
        if (node.value == value) {
            return node.next;
        }
        node.next = deleteNode(node.next, value);
        return node;
    }
}
