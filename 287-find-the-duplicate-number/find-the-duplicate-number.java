// import java.util.HashSet;
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> result= new HashSet<>();
        for (int num : nums) {
            if (!result.add(num)) {
                return num;
        }
        
    }
    return -1;
}
}