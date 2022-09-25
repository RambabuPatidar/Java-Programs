package com.Tree.BinarySearchTree.BSTQuestions.Traversal;

public class SecondLargest {
    Node root;
    // similar question are the kth largest element in the binary tree.
    public SecondLargest() {
    }
    static int count  = 0;
    public void secondLargest(Node root) {
        if (root == null ) {
            return;
        }

        secondLargest(root.right);
        count++;
        if (count == 2) {
            System.out.println(root.data);
            return;
        }
        secondLargest(root.left);
    }
    private static class Node{
        private int data;
        private Node left;
        private Node right;

        public Node() {
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        SecondLargest tree = new SecondLargest();
        tree.root = new Node(7);
        tree.root.left = new Node(3);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(4);
        tree.root.left.right.right = new Node(5);
//        tree.root.right = new Node(10);
//        tree.root.right.right = new Node(11);
//        tree.root.right.left = new Node(8);


        tree.secondLargest(tree.root);
    }
}
