package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_Recursive {
    static int sum = 0;
    static int factor =1;
    static int count = 0;
    static List<Integer> factorsList = new ArrayList();

    public static int productSum(List<Object> array) {

        for(Object o: array) {
            if(o instanceof Integer) {
                // Sum values with current factor
                sum = sum + factor*(int)o;
            }
            else {
                // increment count
                count++;
                // store previous factor in List
                factorsList.add(factor);
                // increment factor as factorial i.e. 1*2*3... etc...
                factor = factor * (factor+1);

                // Found special array. Recursive function
                productSum((List<Object>)o);

            }
        }
        // Decrement factor as factorial; grab previous value
        if( count > 0)
        factor = factorsList.get(count-1);
        return sum;
    }


    public static void main(String[] args) {
        // Instantiating Lists
        List<Object> list = new ArrayList(Arrays.asList(5, 2, new ArrayList(Arrays.asList(7,-1)), 3, new ArrayList(Arrays.asList(6, new ArrayList(Arrays.asList(-13,8)), 4))));
        List<Object> list2 = new ArrayList(Arrays.asList(1,2,3,4,5));
        List<Object> list3 = new ArrayList(Arrays.asList(1,2,3,4,5));

        System.out.println(list);
        System.out.println(list.get(0) instanceof Integer);
        System.out.println(list.get(4) instanceof ArrayList);

        List<Object> sample = (List) list.get(4);
        System.out.println(sample.get(1));

        System.out.println(((List)list.get(4)).get(1));

       //System.out.println(Solution_Recursive.productSum(list));
        System.out.println(Solution_Recursive.productSum(list2));
    }
}
