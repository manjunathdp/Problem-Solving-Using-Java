# Single Number - Solution Explanation

## Question

**Problem:**  
Given a non-empty array of integers `nums`, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

### Example 1:
**Input:**  
`nums = [2,2,1]`

**Output:**  
`1`

### Example 2:
**Input:**  
`nums = [4,1,2,1,2]`

**Output:**  
`4`

### Example 3:
**Input:**  
`nums = [1]`

**Output:**  
`1`

---

## Constraints:

- `1 <= nums.length <= 3 * 10^4`
- `-3 * 10^4 <= nums[i] <= 3 * 10^4`
- Each element in the array appears twice except for one element which appears only once.

---

## Algorithm Used: Bit Manipulation (XOR)

This algorithm uses the properties of the XOR bitwise operation, which is particularly effective for this problem because:

1. **Identity:** `x ^ 0 = x`
2. **Self-inverse:** `x ^ x = 0`
3. **Commutative and Associative:** The order of operations does not matter.

By XORing all elements together, the duplicate numbers will cancel out, leaving only the unique number.

---

## Step-by-Step Explanation

Let’s take the example `nums = [4,1,2,1,2]`.

### Iteration Breakdown:

- Initial value: `singleNumber = 4` (first element)
- `singleNumber = 4 ^ 1 = 5` (4 and 1)
- `singleNumber = 5 ^ 2 = 7` (5 and 2)
- `singleNumber = 7 ^ 1 = 6` (7 and 1)
- `singleNumber = 6 ^ 2 = 4` (6 and 2)

### Final Result:
The resulting single number is **`4`**.

---

## Time and Space Complexity

- **Time Complexity:** `O(n)`, where `n` is the length of the array.
- **Space Complexity:** `O(1)`, since we are using only a constant amount of space.

---

## Java Code

```java
class Solution {
    public int singleNumber(int[] nums) {
        int singleNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            singleNumber = singleNumber ^ nums[i];
        }
        return singleNumber;
    }
}
