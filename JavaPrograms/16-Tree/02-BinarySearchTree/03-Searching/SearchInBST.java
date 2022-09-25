package com.Tree.BinarySearchTree.Searching;

import com.Tree.BinarySearchTree.BuiltBST.Insert;

public class SearchInBST extends Insert {

    // we want to search key in the Binary Search Tree.

    public boolean searchInBST(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return searchInBST(root.left, key);
        }
        return searchInBST(root.right, key);
    }

    public static void main(String[] args) {
        SearchInBST tree = new SearchInBST();
        tree.root = tree.insertInBST(tree.root, 4);
        tree.root = tree.insertInBST(tree.root,2);
        tree.root = tree.insertInBST(tree.root,6);
        tree.root = tree.insertInBST(tree.root,5);
        tree.root = tree.insertInBST(tree.root,3);
        tree.root = tree.insertInBST(tree.root,1);
        tree.root = tree.insertInBST(tree.root,7);

        System.out.println(tree.searchInBST(tree.root, 10));
    }
}
