package com.Tree.BinaryTree.BinaryTreeQuestions.Traversals.Iterative;

import java.util.ArrayDeque;
import java.util.Deque;

public class Spiral {
    Node root;

    public Spiral() {
    }

    public void printSpiral() {
        Deque<Node> queue = new ArrayDeque<>();

        queue.addLast(root);
        int level = 0; // level at which I am currently
        while (!queue.isEmpty()) {
            int n = queue.size();

            if ((level & 1) == 0) {
                for (int i = 0; i < n; i++) {
                    Node node = queue.removeLast();
                    System.out.print(node.data + " ");

                    if (node.left != null) {
                        queue.addFirst(node.left);
                    }
                    if (node.right != null) {
                        queue.addFirst(node.right);
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    Node node = queue.removeFirst();
                    System.out.print(node.data + " ");

                    if (node.right != null) {
                        queue.addLast(node.right);
                    }
                    if (node.left != null) {
                        queue.addLast(node.left);
                    }
                }
            }
            level++ ;
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
        Spiral tree = new Spiral();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);
        tree.root.right.left.left = new Node(12);
        tree.root.right.left.right = new Node(13);
        tree.root.right.right.left = new Node(14);
        tree.root.right.right.right = new Node(15);

        // Running the problem method

        tree.printSpiral();
    }
}
