package org.example;


import java.util.ArrayList;
import java.util.List;

public class Solution_Recursive {
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
        List<Integer> sums = new ArrayList<>();

        return calculateBranchSums(root, 0, sums);

    }

    public static List<Integer> calculateBranchSums(BinaryTree node, int runningSum, List sums) {
        if(node == null) {
            return sums;
        }
        int newRunningSum = runningSum + node.value;

        if(node.left == null && node.right == null) {
            sums.add(newRunningSum);
            return sums;
        }

        calculateBranchSums(node.left, newRunningSum, sums) ;
        calculateBranchSums(node.right, newRunningSum, sums);
        return sums;

    }

    public static void main( String[] args )
    {
        // Constructing sample Binary Tree input
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

        for(Integer i: Solution_Recursive.branchSums(tree)) {
            System.out.printf("%d " , i);
        }
    }
}
