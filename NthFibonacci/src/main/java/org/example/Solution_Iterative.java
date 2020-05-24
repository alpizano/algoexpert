package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution_Iterative {
    public static int getNthFib(int n) {
        List<Integer> list = new ArrayList<>();

        // Add fib base cases to list
        list.add(0);
        list.add(1);

        int i=2;
        int nMinusOne = 0;
        int nMinusTwo =1;

        while(i < n) {
            list.add(i, list.get(nMinusOne)+ list.get(nMinusTwo));
            nMinusOne++;
            nMinusTwo++;
            i++;
        }

        return list.get(n-1);
    }

    public static void main(String[] args) {
        System.out.println(Solution_Iterative.getNthFib(6));
    }
}
