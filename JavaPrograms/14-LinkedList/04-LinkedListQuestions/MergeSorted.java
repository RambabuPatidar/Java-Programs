package com.LinkedList.LinkedListQuestions;
// In this we can't use the template becasue the Head in template is static
// so head can not have different head according to the different list as it does
// not dependent on the object;
public class MergeSorted {
    private Node head;

    public MergeSorted() {
    }

    public MergeSorted mergeSortedList(MergeSorted first, MergeSorted second) {
        Node f = first.head;
        Node s = second.head;
        MergeSorted newList = new MergeSorted();

        while (f != null && s != null) {
            if (f.value < s.value) {
                newList.insert(f.value);
                f = f.next;
            } else {
                newList.insert(s.value);
                s = s.next;
            }
        }

        while (f != null ) {
            newList.insert(f.value);
            f = f.next;
        }

        while (s != null) {
            newList.insert(s.value);
            s = s.next;
        }

        return newList;
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
    private class Node {
        private int value;
        private Node next;

        public Node (int value){
            this.value = value;
        }

        public Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        MergeSorted first = new MergeSorted();
        MergeSorted second = new MergeSorted();

        first.insert(1);
        first.insert(3);
        first.insert(5);

        second.insert(1);
        second.insert(2);
        second.insert(9);
        second.insert(14);

        MergeSorted ans = new MergeSorted();
        ans  = ans.mergeSortedList(first, second);
        ans.display();
    }
}
