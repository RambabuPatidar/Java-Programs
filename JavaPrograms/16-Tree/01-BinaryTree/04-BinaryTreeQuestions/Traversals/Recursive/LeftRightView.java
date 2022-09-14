package com.Tree.BinaryTree.BinaryTreeQuestions.Traversals.Recursive;

public class LeftRightView {
    Node root;
    /*
     this will fail as we are considering here a perfect tree.
     something like if the tree has n level(0th as first) then it must have
     ((2 ^ (n + 1)) - 1). But that will not be the case every time
     for example given tree is : pre-order array = 1, 2, 3, 4, 5, 6, 7, 8
                                    in-order array = 3, 2, 4, 1, 6, 5, 7, 8 (how to construct the tree is given in builtTree package)
     the left view according to us will be 1, 2, 3
     but the actual answer is 1, 2, 3, 8.
    */
    public LeftRightView() {
    }

    public void rightView(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        rightView(root.right);
    }
    public void leftView(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        leftView(root.left);
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
        LeftRightView tree = new LeftRightView();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        // Running the problem method
        System.out.print("Right view : ");
        tree.rightView(tree.root);
        System.out.println();
        System.out.print("Left view : ");
        tree.leftView(tree.root);
    }
}
