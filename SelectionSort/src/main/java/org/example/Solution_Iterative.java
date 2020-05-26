package org.example;


public class Solution_Iterative {
    public static void main(String[] args) {
        int[] array = new int[]{8, 5, 2, 9, 5, 6, 3};

        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[lowestIndex]) {
                    lowestIndex = j;
                    found = true;
                }
                if (j == array.length - 1 && found == true) {
                    int tmp = array[i];
                    array[i] = array[lowestIndex];
                    array[lowestIndex] = tmp;
                    found = false;
                }
            }
        }
        for (int i : array) {
            System.out.printf("%d ", i);
        }
    }
}
