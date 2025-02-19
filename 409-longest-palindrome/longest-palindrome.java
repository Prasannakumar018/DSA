class Solution {
    public int longestPalindrome(String s) {
 HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int palindromeLength = 0;
        boolean hasOddCount = false;

        // Traverse the frequency map
        for (int count : freqMap.values()) {
            if (count % 2 == 0) {
                // If count is even, add all occurrences to the palindrome length
                palindromeLength += count;
            } else {
                // If count is odd, add the largest even number (count - 1)
                palindromeLength += count - 1;
                hasOddCount = true;
            }
        }

        // If there's any odd frequency, we can add 1 to the palindrome length for the center
        if (hasOddCount) {
            palindromeLength += 1;
        }

        return palindromeLength;
    }
}
