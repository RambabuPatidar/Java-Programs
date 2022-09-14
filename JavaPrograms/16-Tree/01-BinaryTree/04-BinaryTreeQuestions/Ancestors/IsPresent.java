package com.Tree.BinaryTree.BinaryTreeQuestions.Ancestors;

public class IsPresent {
    Node root;

    public IsPresent() {
    }
// Returns true f the node is present in the tree

    public boolean isPresent(Node root, int value) {
        if (root == null) {
            return false;
        }

        if (root.data == value) {
            return true;
        }

/*
        boolean inLeft = isPresent(root.left, value);
        boolean inRight = isPresent(root.right, value);
        return inLeft || inRight;
*/

        return isPresent(root.left, value) || isPresent(root.right,value);
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
        IsPresent tree = new IsPresent();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        // Running the problem method

        System.out.println(tree.isPresent(tree.root, 10));
    }
}
