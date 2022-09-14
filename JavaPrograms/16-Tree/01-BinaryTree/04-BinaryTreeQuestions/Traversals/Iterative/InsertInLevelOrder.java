package com.Tree.BinaryTree.BinaryTreeQuestions.Traversals.Iterative;

import java.util.ArrayDeque;
import java.util.Queue;

public class InsertInLevelOrder {
    Node root;

    public InsertInLevelOrder() {
    }

    public Node insertKey(Node root, int key ) {
        Node newNode = new Node(key);
        if (root == null) {
            return newNode;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            Node node = queue.remove();

            if (node.left != null) {
                queue.add(node.left);
            } else {
                node.left = newNode;
                break;
            }

            if (node.right != null) {
                queue.add(node.right);
            } else {
                node.right = newNode;
                break;
            }
        }
        return root;
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
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
        InsertInLevelOrder tree = new InsertInLevelOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
//        tree.root.right.right = new Node(7);
        // Running the problem method

        Node newRoot = tree.insertKey(tree.root, 7);
        tree.preorder(newRoot);
    }
}
