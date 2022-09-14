package com.Tree.BinaryTree.BinaryTreeQuestions.Traversals.Recursive;

public class NthNodeInPreorder {
    Node root;

    public NthNodeInPreorder() {
    }

    // to avoid the confusion do it with the iterative way which is easy.
    static int n;
    public void nthNode(Node root) {
        if (root == null) {
            return;
        }
        if (n >= 0) {
            if (n == 0) {
                System.out.println(root.data);
            }
            n--;
            nthNode(root.left);
            nthNode(root.right);
        }
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
        NthNodeInPreorder tree = new NthNodeInPreorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        // Running the problem method
        n = 5;
        tree.nthNode(tree.root);
    }
}
