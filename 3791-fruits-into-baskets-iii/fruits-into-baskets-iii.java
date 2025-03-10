import java.util.ArrayList;
import java.util.List;

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int left = 0;
        int maxValue = 0;
        // Create a list from the baskets array
        List<Integer> list = new ArrayList<>();
        for (int basket : baskets) {
            list.add(basket);
            maxValue = Math.max(maxValue, basket);
        }

        // Process each fruit
        for (int i = 0; i < fruits.length; i++) {
            if(fruits[i] > maxValue){
                left++;
                continue;
            }
            boolean isMatch = false;

            // Try to find the first basket that can hold the current fruit
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) >= fruits[i]) {
                    list.remove(j); // Mark the basket as used (by setting it to 0)
                    isMatch = true;
                    break;
                }
            }

            // If no basket could hold the current fruit, increase the unplaced counter
            if (!isMatch) {
                left++;
            }
        }

        return left;
    }
}
