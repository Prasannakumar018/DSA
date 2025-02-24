class Solution {
    public int lengthOfLongestSubstring(String s) {
        String word = "";
        int maxi = 0;  // Initialize maxi to 0
        
        // Edge case: If the string is empty, return 0
        if (s.length() == 0) return 0;

        for (int i = 0; i < s.length(); i++) {  // Iterate over the string
            for (int j = i; j < s.length(); j++) {  // Iterate over the substring starting at i
                // If the character is already in word, break out of the inner loop
                if (word.indexOf(s.charAt(j)) != -1) {
                    break;
                }
                // Add the current character to the word
                word += s.charAt(j);
                // Update the maxi to the maximum length of word
                maxi = Math.max(maxi, word.length());
            }
            // Reset word to empty for the next iteration starting at i
            word = "";
        }

        return maxi;
    }
}
