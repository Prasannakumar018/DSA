class Solution {
    public String convert(String s, int numRows) {
        // Edge case handling: if numRows is 1 or string length is less than 2, return the string itself
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        
        // Create an array of StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;  // Flag to track direction (down or up)

        // Traverse through the string, adding characters to respective rows
        for (int i = 0; i < s.length(); i++) {
            rows[currentRow].append(s.charAt(i));

            // If we are at the first or last row, reverse the direction
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move up or down depending on the direction
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows to get the final result
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
