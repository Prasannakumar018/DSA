import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (hashMap.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] { hashMap.get(complement), i };
            }
            
            // Store the number and its index in the map
            hashMap.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        return new int[] {};
    }
}
