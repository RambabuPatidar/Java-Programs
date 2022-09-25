package com.Tree.BinarySearchTree.BuiltBST;

public class FromPreorder {

    private Node root;

    public FromPreorder() {
    }
    // This has O(n^2) time complexity
    // exactly the same approach that we had done in
    // building binary tree.
    // can I do it in O(n) time complexity.
    public Node builtTree(int[] preorder) {
        return helper(preorder, 0, preorder.length - 1);
    }

    private Node helper(int[] preorder, int start, int end) {
        if (start > end) {
            return null;
        }

        Node root = new Node(preorder[start]);
        int position = greaterElement(preorder, start, end);

        if (start == end ) {
            return new Node(preorder[start]);
        }

        root.left = helper(preorder, start + 1, position -1);
        root.right = helper(preorder, position, end);

        return root;
    }

    private int greaterElement(int[] preorder, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (preorder[i] > preorder[start]) {
                return i;
            }
        }
        return end;
    }
    // another O(N2) method is to insert all the element one by one using the
    // loop.
    // insert in BST is done already so if you want try it.
    private static class Node{
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
        // example testcase: {10, 5, 1, 7, 40, 50}
        int[] preorder = {7, 3, 2, 5, 4, 6, 9, 8, 10, 11};

        FromPreorder tree = new FromPreorder();
        tree.root = tree.builtTree(preorder);
        tree.display(tree.root);
    }

    private void display(Node root) {
        if (root == null){
            return ;
        }
        display(root.left);
        System.out.print(root.data + " ");
        display(root.right);
    }

}
