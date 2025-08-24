class Solution {
    public int maxArea(int[] height) {
        int front = 0, back = height.length - 1;
        int max_cap = 0;

        while (front < back) {
            int minHeight = Math.min(height[front], height[back]);
            int width = back - front;
            int currentArea = minHeight * width;
            max_cap = Math.max(max_cap, currentArea);

            // Move the pointer pointing to the shorter line
            if (height[front] < height[back]) {
                front++;
            } else {
                back--;
            }
        }

        return max_cap;
    }
}
