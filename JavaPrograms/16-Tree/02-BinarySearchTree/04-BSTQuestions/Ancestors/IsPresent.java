package com.Tree.BinarySearchTree.BSTQuestions.Ancestors;

public class IsPresent {
    Node root;

    public IsPresent() {
    }
    // the same stuff we did in the binary tree also
    // so and look at the directory of ancestor question in bianry tree.
    // now we will do it for BST
    public boolean isPresent(Node root, int value) {
        if (root == null){
            return false;
        }
        if (root.data == value) {
            return true;
        }
        if (root.data > value) {
            return isPresent(root.left, value);
        }
        return isPresent(root.right, value);
    }

    public static class Node{
        public int data;
        public Node left;
        public Node right;

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
