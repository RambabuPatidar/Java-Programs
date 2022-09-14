package com.Tree.BinaryTree.BinaryTreeQuestions.Ancestors;

public class AncestorsOfNode {
    Node root;

    public AncestorsOfNode() {
    }

    public boolean printAncestor(Node root,int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (printAncestor(root.left, key) || printAncestor(root.right, key)) {
            System.out.print(root.data + " ");
            return true;
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
        AncestorsOfNode tree = new AncestorsOfNode();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.right.left = new Node(8);
        // Running the problem method
        tree.printAncestor(tree.root, 8);

    }
}
