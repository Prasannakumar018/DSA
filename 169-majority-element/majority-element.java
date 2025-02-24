import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> charCountMap = new HashMap<>();
        int maxi = 0;
        int majorityElement = -1;  // Initialize with a default value
        
        for (int c : nums) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);  // Corrected the put statement
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxi) {
                maxi = entry.getValue();
                majorityElement = entry.getKey();  // Store the majority element
            }
        }
        
        return majorityElement;  // Return the majority element
    }
}
