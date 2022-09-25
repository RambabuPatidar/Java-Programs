package com.Tree.BinarySearchTree.BSTQuestions.Properties;

import java.util.ArrayList;

public class CheckForBSTII {
    private Node root;

    public CheckForBSTII() {
    }
    // we know that the binary search tree has inorder sorted.
    // we can do it without using the extra space also
    // we can also do it with max and min concept.
//    check here:  https://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
    public boolean isBST(Node root) {
        ArrayList<Integer> inorder = getInorder(root);
        return isSorted(inorder, 0);
    }

    private ArrayList<Integer> getInorder(Node root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        if (root == null ) {
            return inorder;
        }

        ArrayList<Integer> leftList = getInorder(root.left);
        ArrayList<Integer> rightList = getInorder(root.right);

        inorder.addAll(leftList);
        inorder.add(root.data);
        inorder.addAll(rightList);

        return inorder;
    }

    private boolean isSorted(ArrayList<Integer> inorder, int i) {
        if (i == inorder.size() - 1) {
            return true;
        }
        return (inorder.get(i) < inorder.get(i + 1)) && isSorted(inorder,i + 1);
    }

    public Node insertInBST(Node root, int value ){
        if (root == null) {
            return new Node(value);
        }

        if (root.data > value ){
            root.left = insertInBST(root.left, value);
        } else {
            root.right = insertInBST(root.right, value);
        }
        return root;
    }
    public static class Node{
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
        CheckForBSTII tree = new CheckForBSTII();
        tree.root = new Node(6);
        tree.root.left = new Node(5);
        tree.root.right = new Node(0);
        tree.root.left.left = new Node(3);
        tree.root.left.left.left = new Node(1);
        tree.root.left.left.right = new Node(4);
        tree.root.right.left = new Node(7);
        tree.root.right.left.right = new Node(2);

        System.out.println(tree.getInorder(tree.root));
    }
}
