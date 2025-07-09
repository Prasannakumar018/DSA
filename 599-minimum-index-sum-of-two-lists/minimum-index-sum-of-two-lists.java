

import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        // Store elements of list1 with their index
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        // Traverse list2 and look for common strings
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int i = map.get(list2[j]);
                int sum = i + j;

                if (sum < minSum) {
                    result.clear(); // Found a new minimum, clear previous results
                    result.add(list2[j]);
                    minSum = sum;
                } else if (sum == minSum) {
                    result.add(list2[j]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
