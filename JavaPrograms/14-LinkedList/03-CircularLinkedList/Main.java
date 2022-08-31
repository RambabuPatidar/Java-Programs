package com.LinkedList.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();

        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(4);
        list.insertAtTail(5);
        list.insertAtTail(6);
        list.display();
        list.insertInBetween(13, 55);
        list.display();
        System.out.println(list.deleteAtHead());
        list.display();
        System.out.println(list.deleteAtTail());
        list.display();
        System.out.println(list.deleteAtTail());
        list.display();
    }
}
