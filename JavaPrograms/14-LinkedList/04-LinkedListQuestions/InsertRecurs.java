package com.LinkedList.LinkedListQuestions;

public class InsertRecurs extends AnLLTemp {
    public static void main(String[] args) {
        AnLLTemp list = new AnLLTemp();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(9);
        list.insertAtTail(14);
        insertRec(2, 10);
        list.display();
    }
    public static void insertRec(int index, int value) {
        head = insertRec(value, index, head);
    }

    public static Node insertRec(int value, int index, Node node) {
        if (index == 0){
            Node newNode = new Node(value,node);
            return newNode;
        }
        node.next = insertRec(value,--index,node.next);
        return node;
    }
}
