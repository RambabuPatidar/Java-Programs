package com.Tree.BinaryTree.BinaryTreeQuestions.Ancestors;

import java.util.ArrayList;

// LCA : lowest common ancestor
public class LCA {
    Node root;

    public LCA() {
    }


    // the simple method is to first find the path of ancestors for both the values
    //and then compare the both paths and return the obvious one.
    public int lca(Node root, int val1, int val2) {
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();
        if (!(helper( root, val1, list1) && helper( root, val2, list2))){
            return -1;
        }
        int size1 = list1.size();
        int size2 = list2.size();
        int prev = 0;
        int i;
        for ( i = 0; i < Math.min(size1,size2); i++) {
            prev = list1.get(size1 - i - 1).data;
            if (list1.get(size1 - i - 1) != list2.get(size2 - i - 1)) {
                return list1.get(size1 - i).data;
            }
        }
        return prev;
    }

    private boolean helper(Node root, int key, ArrayList<Node> list) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            list.add(root);
            return true;
        }

        if (helper(root.left, key, list) || helper(root.right, key, list)) {
            list.add(root);
            return true;
        }
        return false;
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
        LCA tree = new LCA();
        LCA t = new LCA();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.right.left = new Node(8);
        tree.root.left.left.left = new Node(9);
        // Running the problem method

        t.root = new Node(7);
        t.root.left = new Node(1);
        t.root.left.right = new Node(2);
        t.root.left.right.right = new Node(4);
        t.root.right = new Node(10);
        t.root.right.left = new Node(9);
        t.root.right.left.left = new Node(8);
        t.root.right.right = new Node(11);
        t.root.right.right.right = new Node(12);
        System.out.println(t.lca(t.root, 7, 2));
    }
}
