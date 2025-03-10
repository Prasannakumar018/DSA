class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;  // To count the number of unplaced fruits

        // Iterate over each fruit in the fruits array
        for (int i = 0; i < fruits.length; i++) {
            boolean placed = false;  // Flag to track if the current fruit was placed in any basket

            // Try placing the current fruit in any of the baskets
            for (int j = 0; j < baskets.length; j++) {
                if (baskets[j] >= fruits[i]) {  // If the basket has enough space for the current fruit
                    baskets[j] =0;  // Place the fruit in this basket (decrease the available space)
                    placed = true;  // Mark this fruit as placed
                    break;  // Exit the inner loop once the fruit is placed
                }
            }

            // If the fruit was not placed, increment the count of unplaced fruits
            if (!placed) {
                count++;
            }
        }

        return count;  // Return the number of unplaced fruits
    }
}
