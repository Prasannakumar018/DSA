import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int i = 0, j = 0;
        
        // Merging both arrays into the ArrayList
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                a.add(nums1[i++]);  // Increment index i after adding an element
            } else {
                a.add(nums2[j++]);  // Increment index j after adding an element
            }
        }
        
        // Add any remaining elements from nums1
        while (i < nums1.length) {
            a.add(nums1[i++]);
        }
        
        // Add any remaining elements from nums2
        while (j < nums2.length) {
            a.add(nums2[j++]);
        }
        
        // Convert ArrayList to Integer array
        Integer[] mergedArray = a.toArray(new Integer[0]);
        
        // Sorting the array (although it should already be sorted)
        Arrays.sort(mergedArray);

        // Calculate the median
        int n = mergedArray.length;
        if (n % 2 == 1) {
            // If the length is odd, return the middle element
            return mergedArray[n / 2];
        } else {
            // If the length is even, return the average of the two middle elements
            return (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0;
        }
    }
}
