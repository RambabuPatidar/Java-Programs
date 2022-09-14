package com.Tree.BinaryTree.BinaryTreeQuestions.SumOfNodes;

public class SumReplacement {
    Node root;

    public SumReplacement() {
    }

    public void replaceSum(Node root) {
        if (root.left == null || root.right == null) {
            return;
        }
        replaceSum(root.left);
        replaceSum(root.right);

        root.data += root.left.data + root.right.data;
    }

    private void preorder(Node root) {
        if (root == null) {
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
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
        SumReplacement tree = new SumReplacement();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        // Running the problem method

        tree.replaceSum(tree.root);

        tree.preorder(tree.root);
    }
}
