class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1, n= digits.length;
        int last=digits[n-1];
        ArrayList<Integer> result= new ArrayList<>();
    
        for(int i=n-1;i>=0;i--){
            int sum = digits[i] + carry;
            carry=sum/10;
            digits[i] = sum % 10; 

        }

         if (carry == 1) {
            result.add(1);
            for (int digit : digits) {
                result.add(digit);
            }
            // Convert ArrayList to int[]
            int[] resArr = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                resArr[i] = result.get(i);
            }
            return resArr;
        }

        // No carry left, return original array
        return digits;
    }
}