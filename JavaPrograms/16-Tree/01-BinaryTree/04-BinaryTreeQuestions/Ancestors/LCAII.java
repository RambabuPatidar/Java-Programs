package com.Tree.BinaryTree.BinaryTreeQuestions.Ancestors;

public class LCAII {
    Node root;

    public LCAII() {
    }
    // if we will not pass the root it will also work because the
    // function will be called by some object and the particular root
    // can be accessed in the LCAII class directly.

    public int lca2(Node root, int val1, int val2) {
        // check that if the tree is null
        if (root == null) {
            return -1;
        }

        // check if the both the values are present in the tree
        // then only it is possible to find the lca otherwise not

        if (!isPresent(root, val1) && !isPresent(root, val2)) {
            return -1;
        }

        return helperLCA(root, val1, val2).data;
    }

    private Node helperLCA(Node root, int val1, int val2) {
        if (root == null) {
            return null;
        }

        if (root.data == val1 || root.data == val2) {
            return root;
        }

        Node leftLca = helperLCA(root.left, val1, val2);
        Node rightLca = helperLCA(root.right, val1, val2);
        // if both are not null this is the lca node return it.
        if (leftLca != null && rightLca != null) {
            return root;
        }

        //here any of one will be null or both will be null in this
        // case return the non-null and null respectively.

//        if (leftLca != null) {
//            return leftLca;
//        } else {
//            return rightLca;
//        }
        return leftLca != null ? leftLca : rightLca;
    }

    private boolean isPresent(Node root, int value) {
        if ( root == null) {
            return false;
        }
        if (root.data == value) {
            return true;
        }
        // any one of them is true then return the result of that recursive call
        // as true otherwise if both are false then return false;
        return isPresent(root.left, value) || isPresent(root.right, value);
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
        LCAII tree = new LCAII();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.right.right = new Node(8);
        // Running the problem method

        System.out.println(tree.lca2(tree.root, 8, 5));
    }
}
