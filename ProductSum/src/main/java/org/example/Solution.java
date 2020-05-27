package org.example;


import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main( String[] args )
    {
        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        List<Object> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(-1);
        list.add(list2);

        System.out.println(list);
        System.out.println(list.get(1) instanceof ArrayList);

        for(int i=0; i<array.length; i++) {

        }
    }
}
