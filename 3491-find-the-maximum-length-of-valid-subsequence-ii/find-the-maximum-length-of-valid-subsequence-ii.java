class Solution {
    public int maximumLength(int[] nums, int k) {
        int n= nums.length;
        int[][] dp = new int[k][k];
        int maxLen = 0;

        for (int num : nums) {
            int mod = num % k;
            for (int prevMod = 0; prevMod < k; prevMod++) {
                // Update dp table based on the previous value's mod
                dp[mod][prevMod] = Math.max(dp[mod][prevMod], dp[prevMod][mod] + 1);
                maxLen = Math.max(maxLen, dp[mod][prevMod]);
            }
        }

        return maxLen ;
    }
}