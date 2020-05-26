package org.example;

public class Solution_Iterative
{
    public static int binarySearch(int[] array, int target) {
        int lowerBound = 0;
        int upperBound = array.length-1;
        int middle = (lowerBound + upperBound) /2;

        while(lowerBound <= upperBound) {
            if(array[middle] == target) {
                return middle;
            }
            else if(target < array[middle]) {
                upperBound = middle -1;
            }
            else if(target > array[middle]){
                lowerBound = middle + 1;
            }
            middle = (lowerBound +upperBound)/2;
        }
        return -1;
    }
    public static void main( String[] args )
    {
        int[] test = new int[]{0,1,21,33,45,45,61,71,72,73};
        System.out.println(Solution_Iterative.binarySearch(test,33));
    }
}
