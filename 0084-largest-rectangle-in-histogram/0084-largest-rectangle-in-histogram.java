import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int res = 0;
        int[] lfs = new int[n];
        int[] rfs = new int[n];
        Arrays.fill(rfs, n - 1);

        Stack<Integer> stack = new Stack<>();

        // Compute left boundaries
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                lfs[i] = 0;
            } else {
                lfs[i] = stack.peek() + 1;
            }
            stack.push(i);
        }

        stack.clear();

        // Compute right boundaries
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                rfs[i] = stack.peek() - 1;
            }
            stack.push(i);
        }

        // Calculate max area
        for (int i = 0; i < n; i++) {
            res = Math.max(res, heights[i] * (rfs[i] - lfs[i] + 1));
        }

        return res;
    }
}