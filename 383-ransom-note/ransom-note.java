import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Create a HashMap to store the frequency of each character in the magazine
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        
        // Populate the magazine frequency map
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        // Convert ransomNote to char array and sort it
        char tempArray[] = ransomNote.toCharArray();
        Arrays.sort(tempArray); // Sort ransomNote

        // Now we check if we can find all the characters in the magazine map
        for (char c : tempArray) {
            // If the magazine map doesn't have enough characters, return false
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false;
            }
            // Decrease the count in the magazine map as we've used this character
            magazineMap.put(c, magazineMap.get(c) - 1);
        }

        // If all characters of ransomNote were found in magazine, return true
        return true;
    }
}
