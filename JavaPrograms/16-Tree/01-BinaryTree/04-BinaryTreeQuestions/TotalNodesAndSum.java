package com.Tree.BinaryTree.BinaryTreeQuestions;

import java.util.Arrays;

public class TotalNodesAndSum {
    Node root;

    public TotalNodesAndSum() {
    }

    public int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left + right + 1;
        // replace the redundant left and right by
        // return countNodes(root.left) + countNodes(root.right) + 1;
    }

    // return the values simultaneously
    public int[] countNodesAndSum(Node root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        int[] left = countNodesAndSum(root.left);
        int[] right = countNodesAndSum(root.right);
        // add the values of both the arrays and put it into the left array
        // we can also put them in right. As your wish no problem.just chill
        // and try it out for fun.😊😊
        left[0] += right[0] + 1;
        left[1] += right[1] + root.data;
        return left;
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
        TotalNodesAndSum tree = new TotalNodesAndSum();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        // Running the problem method

        System.out.println(tree.countNodes(tree.root));
        System.out.println(Arrays.toString(tree.countNodesAndSum(tree.root)));
    }
}
