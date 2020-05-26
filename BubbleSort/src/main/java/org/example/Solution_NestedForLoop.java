package org.example;

/**
 * Hello world!
 *
 */
public class Solution_NestedForLoop
{
    // Solving used nested For Loop
    // Time Complexity O(n^2)
    // Space complexity O(1)
    public static int[] bubbleSort(int[] array) {
        // Write your code here
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[j] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
    public static void main( String[] args )
    {
        int[] array = new int[]{8,5,2,9,6,3};

        for(int i: Solution_NestedForLoop.bubbleSort(array))  {
            System.out.printf("%d ", i);
        }
    }
}
