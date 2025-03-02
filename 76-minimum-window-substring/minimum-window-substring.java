import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Frequency map for characters in t
        HashMap<Character, Integer> mapT = new HashMap<>();
        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        // Frequency map for the current window in s
        HashMap<Character, Integer> mapS = new HashMap<>();
        
        int required = mapT.size();
        int formed = 0;
        int left = 0, right = 0;
        int[] result = {-1, 0, 0};  // [window length, left, right]

        // Expand the window with the right pointer
        while (right < s.length()) {
            char c = s.charAt(right);
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);

            // If this character's frequency matches the required frequency in t
            if (mapT.containsKey(c) && mapS.get(c).intValue() == mapT.get(c).intValue()) {
                formed++;
            }

            // Try to shrink the window from the left if all characters are matched
            while (left <= right && formed == required) {
                c = s.charAt(left);

                // Save the smallest window and update the result
                if (result[0] == -1 || right - left + 1 < result[0]) {
                    result[0] = right - left + 1;
                    result[1] = left;
                    result[2] = right;
                }

                mapS.put(c, mapS.get(c) - 1);
                if (mapT.containsKey(c) && mapS.get(c).intValue() < mapT.get(c).intValue()) {
                    formed--;
                }

                left++;
            }

            // Expand the window to the right
            right++;
        }

        return result[0] == -1 ? "" : s.substring(result[1], result[2] + 1);
    }
}
