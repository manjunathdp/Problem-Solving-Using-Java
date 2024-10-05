package integers._05;

class Solution {
    public int trailingZeroes(int n) {
        int count = 0;

        // Count factors of 5
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }
}

public class TrailingZeroes {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println("Example 1 (n = 3): " + solution.trailingZeroes(3));  // Output: 0
        System.out.println("Example 2 (n = 5): " + solution.trailingZeroes(5));  // Output: 1
        System.out.println("Example 3 (n = 0): " + solution.trailingZeroes(0));  // Output: 0
        System.out.println("Example 4 (n = 25): " + solution.trailingZeroes(25));  // Output: 6
    }
}