class Solution {
    public void sortColors(int[] nums) {
       int left=0, right=nums.length-1, current=0;

       while(current<=right){
        if(nums[current]==0){
            int temp= nums[left];
            nums[left]= nums[current];
            nums[current]= temp;
            left++;
            current++;
        }
        else if(nums[current]==2){
            int temp = nums[right];
            nums[right] = nums[current];
            nums[current] = temp;
            right--;
        }
        else{
            current++;
        }
       }
    }
}