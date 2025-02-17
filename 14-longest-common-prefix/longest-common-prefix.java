class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs == null || strs.length == 0) {
            return "";
        }

        String longPrex = strs[0]; 

        for (int i = 1; i < strs.length; i++) {
           
            while (!strs[i].startsWith(longPrex)) {
                longPrex = longPrex.substring(0, longPrex.length() - 1);
                
                // If the prefix is reduced to an empty string, return ""
                if (longPrex.length() == 0) {
                    return "";
                }
            }
        }
        
        return longPrex;
    }
}
