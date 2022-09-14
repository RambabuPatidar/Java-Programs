package com.Tree.BinaryTree.BinaryTreeQuestions.Traversals.Recursive;

public class LeftRightViewIII {
    Node root;

    public LeftRightViewIII() {
    }

    private static int maxLevel = 0;

    public void leftView(Node root) {
        int level = 1;
        helper(root, level);
    }

    private void helper(Node root, int level) {
        if (root == null) {
            return;
        }

        if (maxLevel < level) {
            System.out.print(root.data + " ");
            maxLevel = level;
        }

        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }

    // do the leftView of this yourself.
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
        LeftRightViewIII tree = new LeftRightViewIII();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.right.right = new Node(8);
        // Running the problem method
//        System.out.print("Right view : ");
//        tree.rightView(tree.root);
//        System.out.println();
        System.out.print("Left view : ");
        tree.leftView(tree.root);
    }
}
