package com.Tree.BinaryTree.BinaryTreeQuestions.Properties;

public class IsFullTree {
    Node root;

    public IsFullTree() {
    }

    public boolean isFull(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left != null && root.right != null) {
/*
            boolean isLeftFull = isFull(root.left);
            boolean isRightFull = isFull(root.right);
            return isLeftFull && isRightFull;
*/
            return isFull(root.left) && isFull(root.right);
        }
        return false;
    }
    static class Node{
        private int data;
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

    public static void main(String[] args) {
        // building the tree
        IsFullTree tree = new IsFullTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        // Running the problem method
        System.out.println(tree.isFull(tree.root));
    }
}
