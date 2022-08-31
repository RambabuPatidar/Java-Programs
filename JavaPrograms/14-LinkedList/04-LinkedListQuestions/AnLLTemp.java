package com.LinkedList.LinkedListQuestions;

public class AnLLTemp {
    public static Node head;
    public Node tail; // Tail approach
    public int size;

    public AnLLTemp() {
        this.size = 0;
    }

    //Basic implementation_______________________________________________
    public void insertAtHead (int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if(tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertAtTail(int value) {
        if(tail == null) {
            insertAtHead(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size += 1;
    }
    public void insertInBetween (int index, int value) throws NullPointerException {
        if(index > size) {
            throw new NullPointerException("index value is greater than size");
        }
        if ( index == 0 ) {
            insertAtHead(value);
            return;
        } else if ( index == size ) {
            insertAtTail(value);
            return;
        } else {
            int position = 0;
            Node temp = head;
            while (position < index) {
                temp = temp.next;
                position++;
            }
            Node newNode = new Node(value, temp.next);
            temp.next = newNode;
            size++;
        }
    }

    public int deleteAtHead () throws Exception {
        if(head == null) {
            throw new Exception("Nothing to delete");
        }
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteAtTail () throws Exception {
        if(size <= 1) {
            return deleteAtHead();
        }
        int value = tail.value;
        Node secondLast = get (size - 2);
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    public int deleteInBetween (int index ) throws Exception {
        if( head == null) {
            throw new Exception("Nothing to delete");
        } else if (index == 0) {
            return deleteAtHead();
        } else if (index == size - 1) {
            return deleteAtTail();
        }
        Node preNode = get (index - 1);
        int value = preNode.next.value;
        preNode.next = preNode.next.next;
        return value;
    }

    public Node findNode (int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Node get (int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display () {
        Node temp = head;
        while ( temp != null ) {
            System.out.print( temp.value + " -> " );


            temp = temp.next;
        }
        System.out.println("null");
    }

    public static class Node {
        public int value;
        public Node next;

        public Node (int value){
            this.value = value;
        }

        public Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}