import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] nsr = new int[n]; // Next Smaller Right
        int[] nsl = new int[n]; // Next Smaller Left

        Stack<Integer> stack = new Stack<>();

        // Next Smaller Right
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nsr[i] = n;
            } else {
                nsr[i] = stack.peek();
            }

            stack.push(i);
        }

        // Clear stack for NSL computation
        stack.clear();

        // Next Smaller Left
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = stack.peek();
            }

            stack.push(i);
        }

        // Calculate maximum area
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int currArea = heights[i] * width;

            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }
}