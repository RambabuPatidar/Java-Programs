package com.Tree.BinaryTree.BinaryTreeQuestions;

import com.Tree.BinaryTree.Traversals.Iterative.LevelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SumAtKthLevel {
    Node root;

    public SumAtKthLevel() {
    }


    public int sumAtKthLevel(int k) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        boolean reached = false;
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                Node node = queue.remove();
                if (k == 0) {
                    reached = true;
                    sum += node.data;
                }

                if (node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            if (reached) {
                break;
            }
            k--;
        }
        return sum;
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
        SumAtKthLevel tree = new SumAtKthLevel();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println(tree.sumAtKthLevel(0));

    }
}