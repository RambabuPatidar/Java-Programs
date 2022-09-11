package com.Tree.BinaryTree.Traversals.Iterative;

import java.util.Stack;

public class Inorder {
    Node root;

    public Inorder() {
    }

    public void inorderIterative() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.peek();
            while (node != null && node.left != null) {
                stack.push(node);
                node = node.left;
            }
            Node top = stack.pop();
            System.out.print(top.data + " ");

            if (top.right != null) {
                stack.push(top.right);
            } else {
                stack.push(stack.peek().right);
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
        Inorder tree = new Inorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.inorderIterative();
    }
}
