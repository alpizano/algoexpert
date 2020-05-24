package org.example;

public class Solution_Recursive {
    public static int getNthFib(int n) {
        int k = n-1;

        if(k==0) {
            return 0;
        }
        else if(k==1) {
            return 1;
        }
        else {
            return getNthFib(k-1) + getNthFib(k-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution_Recursive.getNthFib(6));
    }
}
