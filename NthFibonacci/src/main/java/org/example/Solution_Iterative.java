package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution_Iterative {


    public static void main(String[] args) {
        int n = 6;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        int i=2;
        int nMinusOne = 0;
        int nMinusTwo =1;
        int fibNum = n-1;

        while(i <= fibNum) {
            list.add(i, nMinusOne + nMinusTwo);
            i++;
            nMinusOne++;
            nMinusTwo++;
        }

        System.out.println(list.get(fibNum));

    }
}
