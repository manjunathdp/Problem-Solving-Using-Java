# Palindrome Number - Solution Explanation

## Question

**Problem:**  
Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

### Example 1:
**Input:**  
`x = 121`

**Output:**  
`true`

**Explanation:**  
121 reads as 121 from left to right and from right to left.

---

### Example 2:
**Input:**  
`x = -121`

**Output:**  
`false`

**Explanation:**  
From left to right, it reads `-121`. From right to left, it becomes `121-`. Therefore, it is not a palindrome.

---

### Example 3:
**Input:**  
`x = 10`

**Output:**  
`false`

**Explanation:**  
Reads `01` from right to left. Therefore, it is not a palindrome.

---

## Constraints:

- `-2^31 <= x <= 2^31 - 1`

---

## Algorithm Used: Reverse Integer Approach

The approach used to solve this problem is simple:

1. If `x` is negative, immediately return `false` (as negative numbers cannot be palindromes).
2. Reverse the digits of `x` and store it in a variable.
3. Compare the reversed number with the original number:
    - If they are equal, return `true`.
    - If they are not equal, return `false`.

### Edge Cases:
- If `x` is a negative number, it cannot be a palindrome.
- A number like `10` becomes `01` when reversed, so it's not a palindrome.

---

## Step-by-Step Explanation with Visualization

Let’s take the example `x = 121`.

### Iteration Breakdown:

1. **Initial value:**  
   `x = 121`, `reverse = 0`

2. **Extract last digit:**  
   `lastDigit = 121 % 10 = 1`

3. **Update reverse:**  
   `reverse = (0 * 10) + 1 = 1`

4. **Update x:**  
   `x = 121 / 10 = 12`

Next iteration:

1. **Extract last digit:**  
   `lastDigit = 12 % 10 = 2`

2. **Update reverse:**  
   `reverse = (1 * 10) + 2 = 12`

3. **Update x:**  
   `x = 12 / 10 = 1`

Next iteration:

1. **Extract last digit:**  
   `lastDigit = 1 % 10 = 1`

2. **Update reverse:**  
   `reverse = (12 * 10) + 1 = 121`

3. **Update x:**  
   `x = 1 / 10 = 0`

Final result:  
`reverse = 121`

Since `reverse == original`, the number `121` is a palindrome.

---

## Time and Space Complexity

- **Time Complexity:** `O(n)`, where `n` is the number of digits in `x`. Each digit is processed once.
- **Space Complexity:** `O(1)`, as no extra space is used apart from a few variables.

---

## Java Code

```java
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
