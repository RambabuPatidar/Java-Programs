package com.Tree.BinaryTree.BinaryTreeQuestions;

public class Diameter extends Height{

    public int diameter(Node root) {
       if (root == null) {
           return 0;
       }
/*
       int diameterLeft = diameter(root.left);
       int diameterRight = diameter(root.right);
       int currentDiameter = height(root.left) + height(root.right) + 1;
       return Math.max(Math.max(diameterLeft,diameterRight), currentDiameter);
*/
        return Math.max(Math.max(diameter(root.left), diameter(root.right)), height(root.left) + height(root.right) + 1);
    }

    // For every node the height are computed so that the node are traversed
    // for every node thus if we have n nodes then O(n2) is the time compelexity.
    // TRY SOLVING IT IN O(n) TIME COMPLEXITY.

    public static void main(String[] args) {
        Diameter tree = new Diameter();
        tree.root = new Node(0);
        tree.root.left = new Node(1);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.left.left = new Node(5);
        tree.root.left.left.right = new Node(6);
        tree.root.left.left.right.left = new Node(7);
        tree.root.left.left.right.left.right = new Node(8);
        tree.root.left.right.right = new Node(9);
        tree.root.left.right.right.left = new Node(10);
        tree.root.left.right.right.right = new Node(11);
        tree.root.left.right.right.right.right = new Node(12);
        System.out.println(tree.diameter(tree.root));




    }
}
