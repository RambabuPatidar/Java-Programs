package com.Tree.BinaryTree.BinaryTreeQuestions.Traversals.Iterative;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeftRightViewII {
    Node root;

    public LeftRightViewII() {
    }

    public void rightView(Node root) {
        // Implementing queue using the Deque interface
        Deque<Node> queue = new ArrayDeque<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int n = queue.size();
            System.out.print(queue.peek().data + " ");
            for (int i = 0; i < n; i++) {
                Node node = queue.remove();
                if (node.right != null) {
                    queue.add(node.right);
                }

                if (node.left != null) {
                    queue.add(node.left);
                }
            }
        }
    }
    public void leftView(Node root) {
        Deque<Node> queue = new ArrayDeque<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int n = queue.size();
            System.out.print(queue.peek().data + " ");
            for (int i = 0; i < n; i++) {
                Node node = queue.remove();

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
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
        LeftRightViewII tree = new LeftRightViewII();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.left = new Node(8);
        // Running the problem method
        System.out.print("Right view : ");
        tree.rightView(tree.root);
        System.out.println();
        System.out.print("Left view : ");
        tree.leftView(tree.root);
    }
}
