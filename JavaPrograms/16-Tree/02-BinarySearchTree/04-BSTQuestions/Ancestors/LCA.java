package com.Tree.BinarySearchTree.BSTQuestions.Ancestors;

public class LCA extends IsPresent{
    // The easy method and inefficient method is to find the ancestor
    // path of the both node and then see the first common node from the
    // sequence.

    public int lca(Node root, int value1, int value2) {
        // check is both the values are present

        if (!isPresent(root, value1) || !isPresent(root, value2)) {
            System.out.println("Two values are not present in the Tree");
            return -1; // we assume that the node in tree doesn't have -1 valued node
        }

        return helper(root, value1, value2).data;
    }

    private Node helper(Node root, int value1, int value2) {
        // if any one of the value become equal to root.data
        if (value1 == root.data || value2 == root.data ) {
            return root;
        }
        // if value are opposite to the root.
        if ((value1 < root.data && value2 > root.data) || (value1 > root.data && value2 < root.data)) {
            return root;
        }
        // if values are in left side of root
        if (value1 < root.data) {
            return helper(root.left, value1, value2);
        }
//        if nothing above is true values are in right side of root.
        return helper(root.right, value1, value2);
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
        LCA tree = new LCA();
        int[] preorder = {7, 4, 3, 1, 6, 5, 12, 8, 10};
        for (int j : preorder) {
            tree.root = tree.insertInBST(tree.root, j);
        }
        System.out.println(tree.lca(tree.root, 3, 5));
    }
}
