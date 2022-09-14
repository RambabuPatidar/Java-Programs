package com.Tree.BinaryTree.BinaryTreeQuestions.Properties;

public class IsHeightBalanced extends Height{
    Node root;

    public IsHeightBalanced() {
    }

    public boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

//    static class Node{
//        private int data;
//        public Node left;
//        public Node right;
//
//        public Node() {
//        }
//
//        public Node(int data) {
//            this.data = data;
//        }
//
//        public Node(int data, Node left, Node right) {
//            this.data = data;
//            this.left = left;
//            this.right = right;
//        }
//    }

    public static void main(String[] args) {
        // building the tree
        IsHeightBalanced tree = new IsHeightBalanced();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.right.left = new Node(8);
//        tree.root.left.right.left.left = new Node(9);

        // Running the problem method
        System.out.println(tree.isBalanced(tree.root));
    }
}
