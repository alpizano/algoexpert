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

        System.out.println( "Hello World!" );
    }
}
