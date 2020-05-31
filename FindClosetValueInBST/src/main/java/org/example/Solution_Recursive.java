package org.example;


public class Solution_Recursive
{
    public static int findClosetValueInBst(BST tree, int target) {
        int closetValue =Math.abs(tree.value-target);
        int answer = helper(tree, target, closetValue);
        return answer;
    }

    public static int helper (BST tree, int target, int closetValue) {
        if(tree == null) {
            return closetValue;
        }
        else if(target < tree.value) {
            closetValue = Math.abs(tree.value-target);
           closetValue = helper(tree.left, target, closetValue);
        }
        else if(target > tree.value) {
            closetValue = Math.abs(tree.value-target);
           closetValue = helper(tree.right, target,closetValue);
            }

        return closetValue;
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
        root.right.left.left = new BST(14);

        System.out.println( "Hello World!" );
    }
}
