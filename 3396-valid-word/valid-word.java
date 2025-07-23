class Solution {
    public boolean isValid(String word) {
    int count=0;
    if(word.length() <3) return false;

    boolean hasVowel = false;
    boolean hasConsonant = false;

    for(char c: word.toCharArray()){
        if (!Character.isLetterOrDigit(c)) {
            return false;
    }
    if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
    }
    return hasVowel && hasConsonant;
    }
   

    // Helper to check for vowels
   private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}