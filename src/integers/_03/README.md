# Reverse Integer - Solution Explanation

## Question

**Problem:**  
Given a signed 32-bit integer `x`, return `x` with its digits reversed. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2^31, 2^31 - 1]`, then return `0`.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

### Example 1:
**Input:**  
`x = 123`

**Output:**  
`321`

### Example 2:
**Input:**  
`x = -123`

**Output:**  
`-321`

### Example 3:
**Input:**  
`x = 120`

**Output:**  
`21`

---

## Constraints:

- `-2^31 <= x <= 2^31 - 1`

---

## Algorithm Used: Iterative Reversal

The algorithm works by iteratively extracting the last digit of the number, appending it to the reversed result, and removing the last digit from the original number.

- **Extract the last digit**: Use `x % 10` to get the last digit.
- **Update the reversed number**: Multiply the reversed number by 10 and add the last digit.
- **Check for overflow**: Ensure that the reversed number does not exceed the 32-bit integer range.

---

## Step-by-Step Explanation with Visualization

Let’s take the example `x = 123`.

### Iteration Breakdown:

- Initial value: `x = 123`, `reverse = 0`
- Extract last digit: `lastDigit = 123 % 10 = 3`
- Update reverse: `reverse = (0 * 10) + 3 = 3`
- Update x: `x = 123 / 10 = 12`

Next iteration:
- Extract last digit: `lastDigit = 12 % 10 = 2`
- Update reverse: `reverse = (3 * 10) + 2 = 32`
- Update x: `x = 12 / 10 = 1`

Next iteration:
- Extract last digit: `lastDigit = 1 % 10 = 1`
- Update reverse: `reverse = (32 * 10) + 1 = 321`
- Update x: `x = 1 / 10 = 0`

Final result: `reverse = 321`

---

### Handling Negative Numbers:
If `x` is negative (e.g., `x = -123`), the same steps are followed. The final reversed result is multiplied by `-1` to account for the negative sign.

### Overflow Handling:
Before updating `reverse`, we check if it will overflow:
- If `reverse > Integer.MAX_VALUE / 10` or `reverse < Integer.MIN_VALUE / 10`, we return `0` to handle overflow conditions.

---

## Time and Space Complexity

- **Time Complexity:** `O(n)`, where `n` is the number of digits in `x`. Each digit is processed once.
- **Space Complexity:** `O(1)`, as no extra space is used apart from a few variables.

---

## Java Code

```java
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
