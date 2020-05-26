package org.example;


import java.util.List;

public class Solution {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        return null;
    }

    public static void main( String[] args )
    {
        BinaryTree tree = new BinaryTree(1);
        tree.left = new BinaryTree(2);
        tree.left.left = new BinaryTree(4);
        tree.left.left.left = new BinaryTree(8);
        tree.left.left.right = new BinaryTree(9);
        tree.left.right = new BinaryTree(5);
        tree.left.right.left = new BinaryTree(10);
        tree.right = new BinaryTree(3);
        tree.right.left = new BinaryTree(6);
        tree.right.right = new BinaryTree(7);

        for(Integer i: Solution.branchSums(tree)) {
            System.out.printf("%d" , i);
        }
    }
}
