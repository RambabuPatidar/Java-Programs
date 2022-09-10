package com.Tree.BinaryTree.BuildTree;

public class ByInorderPostorder {

    Node root;
    static int i = 0; // this does not depend on the object of the class

    public ByInorderPostorder() {
    }

    public Node builtTree(int[] in, int[] post, int s, int e) {
        if (s > e) {
            return null;
        }
        Node root = new Node(post[i--]);
        int position = searchIdx(root.data, in, s, e);
        root.right = builtTree(in, post, position + 1, e);
        root.left = builtTree(in, post, s, position - 1);
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
    // postorder display function
    public void postorder(Node root) {
        if ( root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
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
        int[] post = {4, 5, 2, 6, 7, 3, 1};// postorder array

        ByInorderPostorder tree = new ByInorderPostorder();
        i = in.length - 1;
        Node root = tree.builtTree(in, post, 0, in.length - 1);
        tree.postorder(root);
        System.out.println();
        // now if built tree again we have to initialize i to 0 again
        // as it is static it will not automatically change its value
        i = in.length - 1;
        Node root2 = tree.builtTree(in, post, 0, in.length -1);
        tree.postorder(root2);

    }
}
