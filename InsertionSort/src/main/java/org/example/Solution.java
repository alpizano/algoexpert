package org.example;


import java.util.Arrays;

public class Solution
{
    public static int[] insertionSort(int[] array) {
        for(int i=1; i<array.length; i++) {
            // store temp var
            int tmp = array[i];
            int gap = i;

            // while the gap is not at the end of the left side of the array
            while(gap > 0) {
                if(array[gap-1] > tmp) {
                    array[gap] = array[gap-1];
                    gap--;
                }
                else{
                    break;
                }
            }
            array[gap] = tmp;
        }
        return array;
    }

    public static void main( String[] args )
    {
        int[] array = new int[]{8,5,2,9,5,6,3};
        System.out.println(Arrays.toString(array));

        for(int i : Solution.insertionSort(array)) {
            System.out.print(i +  " ");
        }
    }
}
