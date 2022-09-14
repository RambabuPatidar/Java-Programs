package com.Tree.BinaryTree.BuildTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ByLinkedList {
    ListNode head;
    TreeNode root;

    public ByLinkedList() {
    }
    // understand it here : https://www.geeksforgeeks.org/given-linked-list-representation-of-complete-tree-convert-it-to-linked-representation/
    // efficient solution :
    public TreeNode builtTree01(ListNode head) {
        if (head == null ) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        ListNode node = head;
        TreeNode rootOriginal = new TreeNode(node.data);
        TreeNode root = rootOriginal;
        queue.add(root);
        while (node != null) {
            root = queue.remove();

            node = node.next;
            root.left = new TreeNode(node.data);
            queue.add(root.left);

            node = node.next;
            if (node != null) {
                root.right = new TreeNode(node.data);
                queue.add(root.right);
            }
        }
        return rootOriginal;
    }
    // Brute force approach
    public TreeNode builtTree(ListNode head) {
        // first convert the list in to the array
        ListNode node = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.data);
            node = node.next;
        }

        return helper(list, 0);
    }
    private TreeNode helper(ArrayList<Integer> list, int idx) {
        if (idx >= list.size()) {
            return null;
        }

        TreeNode root = new TreeNode(list.get(idx));

        root.left = helper(list, 2 * idx + 1);
        root.right = helper(list, 2 * idx + 2);

        return root;
    }

    public void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public void printLL(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public boolean insert(int key) {
        ListNode newNode = new ListNode(key);
        if (head == null) {
            head = newNode;
            return true;
        }
        ListNode node = head;

        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
        return true;
    }

    static class ListNode{
        private int data;
        private ListNode next;

        public ListNode() {
        }

        public ListNode(int data) {
            this.data = data;
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

    static class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int data ) {
            this.data = data;
        }

        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        ByLinkedList list = new ByLinkedList();
        list.insert(10);
        list.insert(12);
        list.insert(15);
        list.insert(25);
        list.insert(30);
        list.insert(36);

//        list.printLL(list.head);
//        ByLinkedList tree = new ByLinkedList();
//        TreeNode newRoot = tree.builtTree(list.head);
//        tree.printTree(newRoot);

        ByLinkedList tree01 = new ByLinkedList();
        TreeNode newRoot = tree01.builtTree01(list.head);
        tree01.printTree(newRoot);
    }
}
