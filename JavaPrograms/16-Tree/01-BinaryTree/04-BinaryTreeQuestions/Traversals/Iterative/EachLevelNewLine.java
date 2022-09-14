package com.Tree.BinaryTree.BinaryTreeQuestions.Traversals.Iterative;

// To print the level order traversal line by line:

import java.util.LinkedList;
import java.util.Queue;

public class EachLevelNewLine {
    Node root;

    public EachLevelNewLine() {
    }
    // Using level order traversal only.
    public void print() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int n = queue.size();
            if (n != 1) {
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                Node node = queue.remove();
                System.out.print(node.data + " ");
                if (node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }

    // using two queues
    public void print02() {
        Queue<Node> queue1  = new LinkedList<>();
        Queue<Node> queue2  = new LinkedList<>();

        queue1.add(root);
        // if both are empty then we had traversed whole tree.
        while (!queue1.isEmpty() || !queue2.isEmpty()) {

            Node node;

            while (!queue1.isEmpty()) {
                node = queue1.remove();
                System.out.print(node.data + " ");

                if (node.left != null) {
                    queue2.add(node.left);
                }

                if (node.right != null) {
                    queue2.add(node.right);
                }
            }
            System.out.println();
            while (!queue2.isEmpty()) {
                node = queue2.remove();
                System.out.print(node.data + " ");

                if (node.left != null) {
                    queue1.add(node.left);
                }

                if (node.right != null) {
                    queue1.add(node.right);
                }
            }
            System.out.println();
        }
    }

    // using only one queue
    public void print03() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!(queue.isEmpty())) {
            Node node = queue.remove();
            // if the node is not null then do as usual thing
            // otherwise if node == null and queue is not empty then add
            // a null showing that the level is now completed
            // otherwise(i.e. if queue is empty and node == null) don't
            // do anything we traversed whole tree and queue is now empty.
            if (node != null) {
                System.out.print(node.data  + " ");
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null ) {
                    queue.add(node.right);
                }
            } else if (!queue.isEmpty()){
                queue.add(null);
                System.out.println();
            }
        }
    }
    static class Node{
        int data;
        Node left;
        Node right;

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
            EachLevelNewLine tree = new EachLevelNewLine();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);
            tree.root.right.right = new Node(7);
            tree.root.right.left = new Node(6);

//            tree.print();
//            System.out.println();
//            tree.print02();
//            System.out.println();
            tree.print03();
        }
    }
}