package integers._02;

class Solution {
    public int singleNumber(int[] nums) {
        int singleNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            singleNumber = singleNumber ^ nums[i];
        }
        return singleNumber;
    }
}

public class SingleNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] example1 = {2, 2, 1};
        int[] example2 = {4, 1, 2, 1, 2};
        int[] example3 = {1};

        // Calling the singleNumber method and printing results
        System.out.println("Example 1 (nums = [2, 2, 1]): " + solution.singleNumber(example1)); // Output: 1
        System.out.println("Example 2 (nums = [4, 1, 2, 1, 2]): " + solution.singleNumber(example2)); // Output: 4
        System.out.println("Example 3 (nums = [1]): " + solution.singleNumber(example3)); // Output: 1
    }
}
