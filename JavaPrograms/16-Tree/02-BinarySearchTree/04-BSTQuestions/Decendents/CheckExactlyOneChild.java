package com.Tree.BinarySearchTree.BSTQuestions.Decendents;

import com.Tree.BinarySearchTree.BSTQuestions.Properties.CheckForBSTII;

public class CheckExactlyOneChild {
    private Node root;

    public CheckExactlyOneChild() {
    }

    // if the nodes will have exact one node than the element which are descendents
    // will either be greater or smaller for every subtree.
    // so check that only.
    // Time complexity O(n^2)
    public boolean checkExactlyOneChild(int[] preorder) {
        for(int i = 0; i < preorder.length - 1; i++){

            for(int j = i + 1; j< preorder.length; j++) {
                // if the first element is greater than all should be greater otherwise return false.
                if (preorder[i] > preorder[j]) {
                    while (j != preorder.length) {
                        if (preorder[i] < preorder[j]) {
                            return false;
                        }
                        j++;
                    }
                }else { // if the first element is smaller than all should be smaller otherwise return false
                    while (j != preorder.length) {
                        if (preorder[i] > preorder[j]){
                            return false;
                        }
                        j++;
                    }
                }
            }
        }
        // now if every number had followed the rule above than at last we have to return true;
        return true;
    }

    // time complexity O(N)
    // the difference of the next element to the node and that last element should
    // be either positive only  or negative only
    public boolean checkExactlyOneChild01(int[] preorder) {

        for (int i = 0; i < preorder.length - 1; i++) {

            int firstDiff = preorder[i] - preorder[i + 1];
            int secondDiff = preorder[i] - preorder[preorder.length - 1];
            if (firstDiff * secondDiff < 0) {
                return false;
            }
        }

        return true;
    }
    private class Node{
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
        CheckExactlyOneChild tree = new CheckExactlyOneChild();
        int[] arr = {20, 10, 11, 13, 12};
        System.out.println(tree.checkExactlyOneChild(arr));
    }
}
