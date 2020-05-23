package org.example;

// ~ 13 min completion time
public class Solution_ForLoop {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int[] answer = new int[0];

        // nested for loop approach
        // time complexity O(n^2)
        // space complexity O(1)
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i] + array[j] == targetSum) {
                    answer = new int[2];
                    answer[0] = array[i];
                    answer[1] = array[j];
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // int[] array = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        // int targetSum = 10;

        int[] test = new int[0];

        for(Integer i: test) {
            System.out.println(i);
        }

    }
}
