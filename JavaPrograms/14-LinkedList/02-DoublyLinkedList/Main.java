package com.LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLList list = new DLList();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(34);
        list.insertAtHead(53);
        list.insertAtTail(123);
        list.insertInBetween(0, 100);
        list.deleteAtHead();
        list.deleteAtTail();
        list.display(); list.displayReverse();
        list.deleteInBetween(0);
        list.display(); list.displayReverse();
        list.deleteNode(2);
        list.display(); list.displayReverse();
        list.insertAfter(34, 10);
        list.display(); list.displayReverse();
        list.insertAfter(1, 10);
        list.display(); list.displayReverse();


    }
}
