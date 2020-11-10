package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSumHashMap {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[0];

        // loop and put key, value pairs in hashmap
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }

        // loop through hashmap. key is number, value is index
       for(Map.Entry pairEntry: map.entrySet()) {
           int complement = targetSum - (int)pairEntry.getKey();

           // need to make sure complement's index is not the same index of key currently iterating on
           if(map.containsKey(complement) && map.get(complement) != (int)pairEntry.getValue()) {
                answer = new int[2];
                answer[0] = (int)pairEntry.getKey();
                answer[1] = complement;
                return answer;
           }
       }
        return answer;
    }

    public static void main(String[] args) {
        int[] test = new int[]{3 ,5, -4, 8, 11, 1, -1, 6};
        int[] answer;

        // Test case
        answer = TwoNumberSumHashMap.twoNumberSum(test, 10);

        for(int i: answer) {
            System.out.print(i + " ");
        }
    }

}
