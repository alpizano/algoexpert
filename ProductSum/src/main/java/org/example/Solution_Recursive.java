package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_Recursive {

    public static int productSum(List<Object> array) {
        int sum = 0;
        int factor = 1;
        int factorsSum = 1;
        int count = 0;
        List<Integer> factorsList = new ArrayList(Arrays.asList(factor));

        int answer = helper(array, sum, factor, count, factorsList, factorsSum);


        return answer;
    }

    public static int helper(List<Object> array, int sum, int factor, int count, List<Integer> factorsList, int factorsSum) {
        for (Object o : array) {
            if (o instanceof Integer) {
                // Sum values with current factor
                sum = sum + factorsSum * (int) o;
            } else {
                // increment count
                count++;
                factor++;
                // store previous factor in List
                factorsList.add(factor);
                // increment factor as factorial i.e. 1*2*3... etc...
                factorsSum = factorsSum * factorsList.get(count);

                // Found special array. Recursive function
                sum = helper((List<Object>) o, sum, factor, count, factorsList, factorsSum);
                factorsList.remove(count);
                count--;
                factorsSum = 1;
                factor = factorsList.get(count);
                factorsSum = factorsSum * factorsList.get(count);

            }
        }

        return sum;
    }


    public static void main(String[] args) {
        // Instantiating Lists
        List<Object> list = new ArrayList(Arrays.asList(5, 2, new ArrayList(Arrays.asList(7, -1)), 3, new ArrayList(Arrays.asList(6, new ArrayList(Arrays.asList(-13, 8)), 4))));
        List<Object> list2 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        List<Object> list3 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        List<Object> list4 = new ArrayList(Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(5))))));
        List<Object> list5 = new ArrayList(Arrays.asList(3, new ArrayList(Arrays.asList(6, new ArrayList(Arrays.asList(-13, Arrays.asList(5, 2), 8)), 4))));


        System.out.println(list);
        System.out.println(list.get(0) instanceof Integer);
        System.out.println(list.get(4) instanceof ArrayList);

        List<Object> sample = (List) list.get(4);
        System.out.println(sample.get(1));

        System.out.println(((List) list.get(4)).get(1));
        System.out.println(list4);

//        System.out.println(Solution_Recursive.productSum(list));
//        System.out.println(Solution_Recursive.productSum(list2));
//        System.out.println(Solution_Recursive.productSum(list4));
        System.out.println(Solution_Recursive.productSum(list5));
    }
}
