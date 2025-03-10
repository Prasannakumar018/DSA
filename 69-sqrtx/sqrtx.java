class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; // Handle special cases like 0 and 1

        long g = x;  // Start with an initial guess as x
        while (g * g > x) {
            g = (g + x / g) / 2; // Update the guess using Newton's method
        }
        return (int) g; // Return the integer part of the square root
    }
}

// Newton's Method for Square Root:
