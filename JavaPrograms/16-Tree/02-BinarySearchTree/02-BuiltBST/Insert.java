package com.Tree.BinarySearchTree.BuiltBST;

public class Insert {
    protected Node root;

    public Insert() {
    }

    // To build a Binary Search tree we will use the insert in BST method
    public Node insertInBST(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (root.data > value) {
            root.left = insertInBST(root.left, value);
        } else {
            root.right = insertInBST(root.right, value);
        }
        return root;
    }

    // method to print the inorder traversal of the BST
    // Fun fact: The inorder traversal of the binary search tree will always
    // in sorted order.

    public void display(Node root) {
        if (root == null) {
            return;
        }

        display(root.left);
        System.out.print(root.data + " ");
        display(root.right);
    }

    // The tree structure will be the same for Binary Search Tree.
    public static class Node{
        public int data;
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

        public static void main(String[] args) {
            /*
             binary search tree can be made manually also
             as we were linking the nodes in the simple tree.
                        for example:
                        Insert tree = new Insert();
                        tree.root = new Node(4);
                        tree.root.left = new Node(2);
                        tree.root.right = new Node(6);
                        tree.root.left.left = new Node(1);
                        tree.root.left.right = new Node(3);
                        tree.root.right.right = new Node(8);

              Try making this on the paper it is a BST but question is that how
              we can make it dynamically means just providing the values and
              it will automatically make tree and return the root of that tree.
            */

            Insert tree = new Insert();

            tree.root = tree.insertInBST(tree.root,4);
            tree.root = tree.insertInBST(tree.root,2);
            tree.root = tree.insertInBST(tree.root,6);
            tree.root = tree.insertInBST(tree.root,5);
            tree.root = tree.insertInBST(tree.root,3);
            tree.root = tree.insertInBST(tree.root,1);
            tree.root = tree.insertInBST(tree.root,7);

            tree.display(tree.root);

        }
    }
}
