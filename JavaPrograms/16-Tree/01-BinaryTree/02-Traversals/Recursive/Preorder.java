package com.Tree.BinaryTree.Traversals.Recursive;

public class Preorder {

    Node root;

    public Preorder() {
    }

    // Preorder traversal of the tree
    // if you are thinking that in the linked list we worked with the temp
    // reference variable so that the real head doesn't get changed
    // but here not. why?
    // this is because in linked list we need to assign the new nodes to traverse
    // like head = head.next . this will definitely change the head.
    // but here I had not assigned root.left or root.right to root again.
    // that's why the node is not getting changed.
    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static class Node{
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
            Preorder tree = new Preorder();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);
            tree.root.right.left = new Node(6);
            tree.root.right.right = new Node(7);

            tree.preorder(tree.root);
            tree.preorder(tree.root);

        }
    }
}
