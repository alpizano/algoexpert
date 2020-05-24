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
    public static void main( String[] args )
    {

        List<Integer> array = new ArrayList(Arrays.asList(5,6,22,25,1,-1,8,10));
        List<Integer> sequence = new ArrayList(Arrays.asList(1,6,-1,10));
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

        System.out.println("j: " + j);
        System.out.println("size(): " + (sequence.size()));
    }
}
