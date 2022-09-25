package com.Tree.BinarySearchTree.BuiltBST;

import java.util.Stack;

public class FromPreorderII {
    Node root;

    public FromPreorderII() {
    }
    // Time complexity is O(n);
    // Done by myself. Make a PR if you found anything wrong.
    public Node builtTree(int[] preorder) {
        Stack<Node> stack = new Stack<>();
        root = new Node(preorder[0]);
        stack.push(root);
        int i = 1;
        while (i != preorder.length) {
            Node newNode = new Node(preorder[i]);
            Node node = stack.peek();
            // if the top value is already less then it is the left value for
            // current node.
            if (preorder[i] < stack.peek().data) {
                node.left = newNode;
            } else {

                // if it is greater than we have to check while we don't get the less
                // element or our stack becomes empty
                // in Any case we have to append its prev to the newNode;
                Node prev = stack.peek();

                while (!stack.isEmpty() && stack.peek().data < preorder[i]) {
                    prev = stack.peek();
                    stack.pop();
                }
                prev.right = newNode;
            }
            stack.push(newNode);
            i++;
        }
        return root;
    }

    public void display(Node root) {
        if (root == null) {
            return;
        }

        display(root.left);
        System.out.print(root.data + " ");
        display(root.right);
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
        FromPreorderII tree = new FromPreorderII();
        int[] preorder = {7, 3, 2, 5, 4, 6, 9, 8, 10, 11};
        preorder = new int[]{10, 5, 1, 7, 40 , 50};
        tree.root = tree.builtTree(preorder);
        tree.display(tree.root);
    }
}
