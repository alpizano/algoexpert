package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_Recursive {
    static int sum = 0;
    static int factor =1;

    public static int productSum(List<Object> array) {
        sum =0;
        factor =1;

        for(Object o: array) {
            if(o instanceof Integer) {
                sum = sum + factor*(int)o;
            }
            else {
                // Found special array. Recursive function
                productSum(array);
            }
        }

        return sum;
    }

    public void helper(List<Object> array) {

    }

    public static void main(String[] args) {
        // Instantiating Lists
        List<Object> list = new ArrayList(Arrays.asList(5, 2, new ArrayList(Arrays.asList(7,-1)), 3, new ArrayList(Arrays.asList(6, new ArrayList(Arrays.asList(-13,8)), 4))));

        System.out.println(list);
        System.out.println(list.get(0) instanceof Integer);
        System.out.println(list.get(4) instanceof ArrayList);

        List<Object> sample = (List) list.get(4);
        System.out.println(sample.get(1));

        System.out.println(((List)list.get(4)).get(1));

        System.out.println(Solution_Recursive.productSum(list));
    }
}
