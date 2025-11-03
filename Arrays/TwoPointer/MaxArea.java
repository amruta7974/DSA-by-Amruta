package Arrays.TwoPointer;

/*
 * 🧩 Category: Arrays | Technique: Two Pointers
 * 🧠 Problem: Container With Most Water
 * 🔗 LeetCode: https://leetcode.com/problems/container-with-most-water/
 *
 * 🎯 Goal:
 * Given an array `height[]`, where each element represents the height of a vertical line
 * on the x-axis, find two lines that together can hold the **maximum area of water**.
 *
 * ✅ Example:
 * Input:  height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 *
 * 💡 Explanation:
 * The max area is between lines at index 1 and 8:
 * min(8, 7) * (8 - 1) = 7 * 7 = 49
 *
 * 💡 Approach:
 * 1. Use two pointers: `left` at the start and `right` at the end.
 * 2. Calculate area = min(height[left], height[right]) * (right - left)
 * 3. Update `maxArea` if the new area is larger.
 * 4. Move the pointer with the shorter line inward to try to find a taller boundary.
 * 5. Continue until both pointers meet.
 *
 * 🕒 Time Complexity: O(n)
 * 🧩 Space Complexity: O(1)
 */

public class MaxArea {

    // Returns the maximum area of water a container can hold
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currArea);

            // Move pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    // 👇 Local test runner for quick verification
    public static void main(String[] args) {
        MaxArea solution = new MaxArea();

        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 1};

        System.out.println("Input: [1,8,6,2,5,4,8,3,7]");
        System.out.println("Maximum Water Area: " + solution.maxArea(height1));

        System.out.println("\nInput: [1,1]");
        System.out.println("Maximum Water Area: " + solution.maxArea(height2));
    }
}

/*
 * ---------------------------------------------
 * 💡 Key Takeaways:
 * ---------------------------------------------
 * ✅ Classic two-pointer optimization problem
 * ✅ Greedy pointer movement logic
 * ✅ Linear time, constant space
 * ---------------------------------------------
 */
