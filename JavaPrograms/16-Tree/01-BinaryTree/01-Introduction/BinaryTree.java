package com.Tree.BinaryTree.Introduction;

// Learn Properties Of Binary Tree: https://www.geeksforgeeks.org/binary-tree-set-2-properties/
// Types of Binary Tree: https://www.geeksforgeeks.org/binary-tree-set-2-properties/

public class BinaryTree {
    private Node root;

    public BinaryTree() {
    }

    static class Node{
        private int data;
        private Node left;
        private Node right;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // adding nodes in the tree.
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

    }
}
