package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Solution_Iterative
{
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int j =0;

        for(Integer i: array) {
            // Loop through array, only increment subsequence ref if sequence ref == array ref
            if(sequence.get(j) == i) {
                j++;
            }
            // Once subseq ref == subseq size, break out of loop to avoid IndexOutOfBounds exception
            if(j == sequence.size()) {
                break;
            }
        }
        return j==sequence.size();
    }
    public static void main( String[] args )
    {
        List<Integer> array = new ArrayList(Arrays.asList(5,1,22,25,6,-1,8,10));
        List<Integer> sequence = new ArrayList(Arrays.asList(1,6,-1,10));

        System.out.println(Solution_Iterative.isValidSubsequence(array,sequence));
    }
}
