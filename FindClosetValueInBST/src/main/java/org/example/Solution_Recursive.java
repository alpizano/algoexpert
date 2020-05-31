package org.example;


public class Solution_Recursive
{
    public static int findClosetValueInBst(BST tree, int target) {
        int answer = helper(tree, target);
        return answer;
    }

    public static int helper (BST tree, int target) {
        if(tree == null) {
            return ;
        }
        else if(target < tree) {
            = helper(tree.left, target);
        else if(target > tree) {
            = helper(tree.right, target);
            }
        }
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
