class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 1) return true;
        
        int i = 1;
        while (i < nums.length && nums[i] == nums[i - 1]) {
            i++;
        }
         if (i == nums.length) return true;
        
        boolean increasing = nums[i] > nums[i - 1]; // flag

        for (; i < nums.length; i++) {
            if (increasing && nums[i] < nums[i - 1]) {
                return false;
            }
            if (!increasing && nums[i] > nums[i - 1]) {
                return false;
            }
        }

        return true;
    }
}