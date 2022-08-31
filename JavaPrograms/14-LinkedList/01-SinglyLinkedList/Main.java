package com.LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        LList list = new LList();
        list.insertAtHead(4);
        list.insertAtHead(3);
        list.insertAtHead(2);
        list.insertAtHead(1);
        list.insertAtTail(5);
        list.insertAtTail(6);

//        System.out.println(list.deleteAtHead());
//        System.out.println(list.deleteAtTail());
        System.out.println(list.deleteInBetween(2));
        list.display();
    }
}
