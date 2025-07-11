class Solution {
    public int rob(int[] nums) {
     int prev=0, nxt=0;
        for(int ele : nums){
            int chk = Math.max(prev, nxt+ele);
            nxt=prev;
            prev=chk;
        }
        return prev;
    }
}