package com.Tree.BinarySearchTree.BSTQuestions.Properties;

public class CheckForBST {
    private Node root;

    public CheckForBST() {
    }

    public boolean isBST(Node root) {
        if (root == null) {
            return true;
        }

        if (root.left != null && maxValue(root.left) >= root.data) {
            return false;
        }
        if (root.right != null && minValue(root.right) <= root.data) {
            return false;
        }

        if (isBST(root.left) || isBST(root.right)) {
            return true;
        }
        return false;
    }

    private int minValue(Node root) {
        if (root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minValue(root.left), minValue(root.right)));
    }

    private int maxValue(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maxValue(root.left), maxValue(root.right)));
    }

    class Node{
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
}
