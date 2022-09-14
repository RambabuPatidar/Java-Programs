package com.Tree.BinaryTree.BinaryTreeQuestions.Properties;

public class Height {
    Node root;

    public Height() {
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
/*
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
*/
        return Math.max(height(root.left), height(root.right)) + 1;
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
        Height tree = new Height();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.right.left.right = new Node(9);
        tree.root.right.left.right.left = new Node(10);

        // Running the problem method
        System.out.println(tree.height(tree.root));
    }
}
