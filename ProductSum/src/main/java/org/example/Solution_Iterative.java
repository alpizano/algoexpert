package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_Iterative
{
    public static void main( String[] args )
    {
        // Create sample list
        List<Object> list = new ArrayList<Object>(Arrays.asList(5, 2, Arrays.asList(7,-1), 3, Arrays.asList(6, Arrays.asList(-13,8), 4)));

        System.out.println(list);
        System.out.println(list.get(1) instanceof ArrayList);

        int factor = 1;
        int sum = 0;
        for(Object element: list) {
            if(element instanceof  ArrayList) {
                factor++;

            }
            else {
                sum = sum + factor * (int)element;
            }
        }

        System.out.println("sum: " + sum);
    }
}
