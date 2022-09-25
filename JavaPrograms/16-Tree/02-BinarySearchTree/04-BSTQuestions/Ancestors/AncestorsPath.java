package com.Tree.BinarySearchTree.BSTQuestions.Ancestors;

public class AncestorsPath extends IsPresent{
    // we can directly use the Node class of the super class.

    // prints ancestors path.
    public void ancestorPath(Node root, int value) {
        // check that the node exists or not.

        if (!isPresent(root, value)){
            System.out.println("Tree is Empty");
            return;
        }
        helper(root, value);
    }
    private void helper(Node root, int value) {
        if (root == null) {
            return;
        }
        if (root.data == value) {
            System.out.print(root.data + " ");
            return;
        }
        if (root.data > value) {
            helper(root.left, value);
        } else{
            helper(root.right, value);
        }
        System.out.print(root.data + " ");
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
        AncestorsPath tree = new AncestorsPath();
        // we will need the preorder traversal
        // if you will use the inorder than the skewed symmetric tree will be formed/

//        int[] inorder = {1, 3, 4, 5, 6, 7, 8, 10, 12};

        int[] preorder = {7, 4, 3,1, 6, 5, 12, 8, 10};
        for (int i = 0; i < preorder.length; i++) {
            tree.root = tree.insertInBST(tree.root, preorder[i]);
        }
        tree.ancestorPath(tree.root, 5);
    }
}
