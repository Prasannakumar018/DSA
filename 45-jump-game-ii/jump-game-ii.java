class Solution {
    public int jump(int[] nums) {
        int current = 0, count = 0, maxi = 0, end = 0;

        while (current < nums.length - 1) {
            maxi = Math.max(maxi, current + nums[current]);
            
            // If we've reached the end of the current jump range
            if (current == end) {
                count++;
                end = maxi;
            }
            
            current++;
        }

        return count;
    }
}
