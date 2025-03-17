class Solution {
    public int findMiddleIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int middle=i;
            int sum=0, sum1=0;
                for(int j=0;j<middle;j++){
                    sum+=nums[j];
                }
                for(int k=middle+1;k<nums.length;k++){
                    sum1+=nums[k];
                }

                if(sum==sum1){
                    return middle;
                }
            }
        return -1;
    }
}
