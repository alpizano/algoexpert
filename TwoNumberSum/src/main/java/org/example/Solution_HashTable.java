package org.example;

import java.util.Hashtable;

public class Solution_HashTable {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        int[] nullAnswer = new int[0];

        // loop and store nums in hashtable
        for (int i = 0; i < array.length; i++) {
            table.put(array[i], i);
        }

        // iterate through hashtable. key is number, value is index
        table.forEach( (k, v) -> {
            // if table contains targetSum - k, then true
            int num2 = targetSum - k;
                System.out.println(k + " " + v);

});
        return nullAnswer;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,3,5,7,9,11};

        Solution_HashTable.twoNumberSum(test, 25);
    }

}
