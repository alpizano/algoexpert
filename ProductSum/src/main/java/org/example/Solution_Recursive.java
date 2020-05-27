package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_Recursive {
    public static int productSum(List<Object> array) {
        return 0;
    }

    public static void main(String[] args) {
        // Instantiating Lists
        List<Object> list = new ArrayList<Object>(Arrays.asList(5, 2, Arrays.asList(7,-1), 3, Arrays.asList(6, Arrays.asList(-13,8), 4)));

        System.out.println(list);
        System.out.println(list.get(1) instanceof ArrayList);
    }
}
