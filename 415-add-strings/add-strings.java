class Solution {
    public String addStrings(String num1, String num2) {
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? arr1[i] - '0' : 0;
            int digit2 = (j >= 0) ? arr2[j] - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            sb.append((char)(digit + '0'));  // convert int back to char

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}
