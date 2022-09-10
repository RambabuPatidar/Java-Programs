package com.Tree.BinaryTree.Traversals.Iterative;

import java.util.Stack;

public class Preorder {
    Node root;

    public Preorder() {
    }

    public void preorderIterative() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.peek();
            System.out.print(node.data + " ");
            stack.pop();

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    static class Node {
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
        Preorder tree = new Preorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.preorderIterative();
    }
}
