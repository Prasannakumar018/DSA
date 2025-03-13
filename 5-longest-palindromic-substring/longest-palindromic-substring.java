class Solution {
    public String longestPalindrome(String s) {
        String result="";
        int maxi=0;
        for(int i=0;i<s.length();i++){
            
            int left=i , right =i;



             while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                // Compare the length of the current palindrome with the previous one
                int currentLength = right - left + 1;
                if (currentLength > maxi) {
                    maxi = currentLength;
                    result = s.substring(left, right + 1); // Update result with the new palindrome
                }
                left--;
                right++;
            }

             // Expand for even-length palindrome (centered between i and i+1)
            left = i; 
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                // Compare the length of the current palindrome with the previous one
                int currentLength = right - left + 1;
                if (currentLength > maxi) {
                    maxi = currentLength;
                    result = s.substring(left, right + 1); // Update result with the new palindrome
                }
                left--;
                right++;
            }
        }

        return result;
    }
}