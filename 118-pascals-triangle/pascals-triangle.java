import java.util.*;

class Solution {
    // Main method to generate Pascal's Triangle up to numRows
    public List<List<Integer>> generate(int numRows) {
        // Initialize a list of lists to store the triangle
        List<List<Integer>> triangle = new ArrayList<>();
        
        // Generate each row of Pascal's Triangle
        for (int i = 0; i < numRows; i++) {
            // Initialize a new row (with i+1 elements)
            List<Integer> row = new ArrayList<>();
            
            // The first and last elements of each row are 1
            for (int j = 0; j <= i; j++) {
                // The first and last elements are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Other elements are the sum of the two elements directly above them
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            
            // Add the row to the triangle
            triangle.add(row);
        }
        
        return triangle;
    }

}
