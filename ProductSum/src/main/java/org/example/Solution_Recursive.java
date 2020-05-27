package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution_Recursive {
    public static void main(String[] args) {
        // Create sample list
        List<Object> list = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        List<Object> list3 = new ArrayList<>();
        List<Object> list4 = new ArrayList<>();

        list.add(5);
        list.add(2);
        list2.add(7);
        list2.add(-1);
        list.add(list2);
        list.add(3);
        list3.add(6);
        list4.add(-13);
        list4.add(8);
        list3.add(list4);
        list.add(list3);
        list3.add(4);

        System.out.println(list);
        System.out.println(list.get(1) instanceof ArrayList);
    }
}
