package org.example;

public class Solution_Recursive {
    public static int getNthFib(int n) {

        if(n==1) {
            return 0;
        }
        else if(n==2) {
            return 1;
        }
        else {
            return getNthFib(n-1) + getNthFib(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution_Recursive.getNthFib(6));
    }
}
