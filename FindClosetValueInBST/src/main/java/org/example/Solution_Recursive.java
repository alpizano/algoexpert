package org.example;


import java.util.HashMap;
import java.util.Map;

public class Solution_Recursive
{
    public static int findClosetValueInBst(BST tree, int target) {
        int answer = helper(tree, target, Math.abs(tree.value-target), 0);
        return answer;
    }

    public static int helper (BST tree, int target, int closetValue, int nodeVal) {
        if(tree == null) {
            return nodeVal;
        }
        else if(target < tree.value) {
            if (Math.abs(tree.value - target) < closetValue) {
                closetValue = Math.abs(tree.value-target);
                nodeVal = tree.value;
            }
           nodeVal = helper(tree.left, target, closetValue, nodeVal);
        }
        else if(target > tree.value) {
            if (Math.abs(tree.value - target) < closetValue) {
                closetValue = Math.abs(tree.value-target);
                nodeVal = tree.value;
            }
           nodeVal = helper(tree.right, target,closetValue, nodeVal);
            }

        return nodeVal;
        }


    static class BST {
        int value;
        BST left;
        BST right;

        public BST(int value) {
            this.value = value;
        }

    }

    public static void main( String[] args )
    {
        BST root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.right = new BST(5);
        root.left.left.left = new BST(1);
        root.right = new BST(15);
        root.right.left = new BST(13);
        root.right.right = new BST(22);
        root.right.left.right = new BST(14);


        System.out.println(Solution_Recursive.findClosetValueInBst(root, 12));
    }
}
