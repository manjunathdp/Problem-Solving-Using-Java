package integers._04;

class Solution {
    public boolean isPalindrome(int x) {
        // Handle negative numbers
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int temp = x;  // Store original number to compare later

        // Reverse the digits of x
        while (x != 0) {
            int lastDigit = x % 10;
            reverse = (reverse * 10) + lastDigit;
            x = x / 10;
        }

        // Compare reversed number with the original number
        return reverse == temp;
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println("Example 1 (x = 121): " + solution.isPalindrome(121));  // Output: true
        System.out.println("Example 2 (x = -121): " + solution.isPalindrome(-121)); // Output: false
        System.out.println("Example 3 (x = 10): " + solution.isPalindrome(10));  // Output: false
        System.out.println("Example 4 (x = 0): " + solution.isPalindrome(0));   // Output: true
    }
}