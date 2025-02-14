class Solution {
    public boolean isPalindrome(String s) {
        String x = s.toLowerCase().replaceAll("[\\s\\p{Punct}]", "");
        String reversed = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            reversed += x.charAt(i);  
        }

         return x.equals(reversed);
    }
}