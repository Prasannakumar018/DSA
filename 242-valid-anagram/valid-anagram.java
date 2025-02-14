import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] charArray = s.toCharArray();
        char[] charArray1 = t.toCharArray();
        
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        
        
        return new String(charArray).equals(new String(charArray1));
    }
}
