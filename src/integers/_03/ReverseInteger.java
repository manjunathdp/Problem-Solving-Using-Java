package integers._03;

class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0;  // Handle overflow
            }
            reverse = (reverse * 10) + lastDigit;
            x = x / 10;
        }
        return reverse;
    }
}

public class ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int example1 = solution.reverse(123);
        int example2 = solution.reverse(-123);
        int example3 = solution.reverse(120);
        int example4 = solution.reverse(1534236469); // Overflow test

        // Output results
        System.out.println("Example 1 (x = 123): " + example1);  // Output: 321
        System.out.println("Example 2 (x = -123): " + example2); // Output: -321
        System.out.println("Example 3 (x = 120): " + example3);  // Output: 21
        System.out.println("Example 4 (x = 1534236469): " + example4); // Output: 0 (overflow)
    }
}