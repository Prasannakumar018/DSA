class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;

        int oneStep=1;
        int secondStep=2;
        int result=0;

        for(int i=3;i<=n;i++){
            result=oneStep+secondStep;
            oneStep=secondStep;
            secondStep=result;

        }
        return result;
    }
}