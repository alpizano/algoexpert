package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};

        List<Integer> list = new ArrayList<>();
        for (Integer val : array) {
            list.add(val);
        }

        Collections.sort(list, Collections.<Integer>reverseOrder());
        int[] answer = new int[3];
        int count = answer.length - 1;
        for (Integer val : list) {
            if (count >= 0) {
                answer[count] = val;
            } else {
                break;
            }
            count--;
        }

        System.out.println(Arrays.toString(answer));
    }
}
