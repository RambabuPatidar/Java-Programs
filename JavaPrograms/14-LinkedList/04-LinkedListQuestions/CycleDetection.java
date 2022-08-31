package com.LinkedList.LinkedListQuestions;

public class CycleDetection {
    Node head;

    public CycleDetection() {
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
    }

    public void display () {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("End");
    }

    public void createCycle(int index) {
        Node node = head;
        Node nodeIdx = null;
        while (node.next != null) {
            if (index == 0) {
               nodeIdx = node;
            }
            index--;
            node = node.next;
        }
        node.next = nodeIdx;
    }

    public boolean detectCycle() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int cycleLength() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                int length = 0;
                do{
                    length++;
                    slow = slow.next;
                } while (slow != fast);
                return length;
            }
        }
        return 0;
    }

    public int cycleStartsNode() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                slow = head;
                while (fast.next != slow.next) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow.next.value;
            }
        }

        return -1;
    }

    public class Node {
        int value;
        Node next;

        public Node (int value) {
            this.value = value;
        }

        public Node (int value, Node next ) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        CycleDetection list = new CycleDetection();
        list.insert(1);
        list.insert(2);
        list.insert(0);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.createCycle(3);
//        list.display();
        System.out.println("does cycle present ? " + list.detectCycle());
        System.out.println( "Length of the cycle is : "  + list.cycleLength());
        System.out.println("Cycle starts with Node value: " + list.cycleStartsNode());
    }
}
