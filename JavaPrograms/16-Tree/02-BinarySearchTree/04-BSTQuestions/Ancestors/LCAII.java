package com.Tree.BinarySearchTree.BSTQuestions.Ancestors;

public class LCAII extends IsPresent{
    // Iterative way
    public int lca(Node root, int value1, int value2) {
        if (root == null) {
            return -1;
        }
        while (root != null) {
            // if the value are smaller
            if (root.data > value1 && root.data > value2) {
                root = root.left;
            }
            // if the values are greater
            if (root.data < value1 && root.data < value2) {
                root = root.right;
            }
            else {
                break;
            }
        }
        return root.data;
    }


    // for making binary search tree
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
    public static void main(String[] args) {
        LCAII tree = new LCAII();
        int[] preorder = {7, 4, 3, 1, 6, 5, 12, 8, 10};
        for (int j : preorder) {
            tree.root = tree.insertInBST(tree.root, j);
        }
        System.out.println(tree.lca(tree.root, 3, 5));
    }
}
