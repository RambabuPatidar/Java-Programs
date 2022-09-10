package com.Tree.BinaryTree.BuildTree;

public class ByInorderPreorder {

    Node root;
    static int i = 0; // this does not depend on the object of the class

    public ByInorderPreorder() {
    }
    public Node builtTree(int[] in, int[] pre, int s, int e) {
        if (s > e) {
            return null;
        }
        Node root = new Node(pre[i++]);
        int position = searchIdx(root.data, in, s, e);
        root.left = builtTree(in, pre, s, position - 1);
        root.right = builtTree(in, pre, position + 1, e);
        return root;
    }

    private int searchIdx(int data, int[] in, int s, int e) {
        for (int i = s; i <= e; i++) {
            if (in[i] == data) {
                return i;
            }
        }
        return -1;
    }

    // preorder display function
    public void preorder(Node root) {
        if ( root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static class Node{
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
        int[] in = {4, 2, 5, 1, 6, 3, 7}; // inorder array
        int[] pre = {1, 2, 4, 5, 3, 6, 7};// preorder array

        ByInorderPreorder tree = new ByInorderPreorder();
        Node root = tree.builtTree(in, pre, 0, in.length - 1);
        tree.preorder(root);
        System.out.println();
        // now if built tree again we have to initialize i to 0 again
        // as it is static it will not automatically change its value
        i = 0;
        Node root2 = tree.builtTree(in, pre, 0, in.length -1);
        tree.preorder(root2);

    }
}
