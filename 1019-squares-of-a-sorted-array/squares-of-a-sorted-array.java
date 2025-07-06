class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[]= new int[nums.length];
        int i=0;
        for(int num:nums){
            int temp= num*num;
            result[i++]=temp;
        }
        Arrays.sort(result);
        return result;
    }
}