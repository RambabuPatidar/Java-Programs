package com.Tree.BinarySearchTree.BuiltBST;

public class InsertIteratively {
    Node root;

    public InsertIteratively() {
    }

    public Node insertInBSTIterative(Node root, int value) {
        // if the root is already null
        if (root == null) {
            return new Node(value);
        }
        Node node = root;
        Node prevNode = null;
        while (node != null) {
            prevNode = node;
            if (node.data > value) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        if (prevNode.data > value) {
            prevNode.left = new Node(value);
        } else {
            prevNode.right = new Node(value);
        }
        return root;
    }
    public void display(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        display(root.left);
        display(root.right);
    }


    public static class Node{
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

        public static void main(String[] args) {

            InsertIteratively tree = new InsertIteratively();

            tree.root = tree.insertInBSTIterative(tree.root,4);
            tree.root = tree.insertInBSTIterative(tree.root,2);
            tree.root = tree.insertInBSTIterative(tree.root,6);
            tree.root = tree.insertInBSTIterative(tree.root,5);
            tree.root = tree.insertInBSTIterative(tree.root,3);
            tree.root = tree.insertInBSTIterative(tree.root,1);
            tree.root = tree.insertInBSTIterative(tree.root,7);

            tree.display(tree.root);

        }
    }
}
