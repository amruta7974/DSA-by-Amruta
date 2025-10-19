// File: Arrays/TwoSum.java
// Purpose: Solve the "Two Sum" problem using brute-force approach
// Topic: Arrays
// Difficulty: Easy

// Class to solve the Two Sum problem
public class TwoSum {

    /**
     * Method to find indices of two numbers in an array that add up to the target
     *
     * @param nums   input array of integers
     * @param target the sum we are looking for
     * @return an array of two indices whose elements sum up to the target
     */
    public int[] twoSum(int[] nums, int target) {
        // Outer loop: iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Inner loop: check every element after the current one
            for (int j = i + 1; j < nums.length; j++) {
                // If the sum of two elements equals the target
                if (nums[i] + nums[j] == target) {
                    // Return their indices as an array
                    return new int[]{i, j};
                }
            }
        }
        // If no solution exists, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * Main method to run and test the Two Sum solution
     */
    public static void main(String[] args) {
        // Create an object of the TwoSum class
        TwoSum ts = new TwoSum();

        // Sample input array
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method
        int[] result = ts.twoSum(nums, target);

        // Print the indices of the elements that sum up to target
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
