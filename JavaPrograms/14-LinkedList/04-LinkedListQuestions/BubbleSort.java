package com.LinkedList.LinkedListQuestions;

public class BubbleSort extends AnLLTemp {
    public static void main(String[] args) {
        AnLLTemp list = new AnLLTemp();
        list.insertAtHead(4);
        list.insertAtTail(1);
        list.insertAtTail(9);
        list.insertAtTail(2);
        list.insertAtTail(0);
        list.insertAtTail(7);
        list.insertAtTail(5);
        list.display();
        bubbleSort();
        list.display();

    }

    public static void bubbleSort() {
        bubbleSort(size() - 1, 0);
    }
    public static void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            Node f = getIndex(col);
            Node s = getIndex(col +1);
            if (f.value > s.value) {
                // swap
                if (f == head) { // if the f and s are in front of list
                    head = s;
                    f.next = s.next;
                    s.next = f;
                } else if (f.next.next == null) { // if f and s are in last of list
                    Node prev = getIndex(col -1);
                    prev.next = s;
                    s.next = f;
                    f.next = null;
                } else { // if f and s are in between the list
                    Node prev = getIndex(col -1);
                    prev.next = f.next;
                    f.next = s.next;
                    s.next = f;
                }
            }
            bubbleSort(row, col + 1);
        } else{
            bubbleSort(row - 1, 0);
        }
    }

    private static int size() {
        Node node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    private static Node getIndex (int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
