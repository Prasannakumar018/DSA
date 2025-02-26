class Solution {
    public int myAtoi(String s) {
        char[] arr = s.toCharArray();
        int i = 0, result = 0, sign = 1;
        
        // Skip leading spaces
        while (i < arr.length && arr[i] == ' ') {
            i++;
        }

        // Handle the sign
        if (i < arr.length && (arr[i] == '+' || arr[i] == '-')) {
            sign = (arr[i] == '-') ? -1 : 1;
            i++;
        }

        // Process the digits
        while (i < arr.length && Character.isDigit(arr[i])) {
            int digit = arr[i] - '0';
            
            // Check for overflow or underflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
