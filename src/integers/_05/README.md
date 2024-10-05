# Trailing Zeroes in Factorial - Solution Explanation

## Question

**Problem:**  
Given an integer `n`, return the number of trailing zeroes in `n!`.

**Note:**
- `n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1`

### Example 1:
**Input:**  
`n = 3`

**Output:**  
`0`

**Explanation:**  
3! = 6, and there are no trailing zeroes.

---

### Example 2:
**Input:**  
`n = 5`

**Output:**  
`1`

**Explanation:**  
5! = 120, and there is one trailing zero.

---

### Example 3:
**Input:**  
`n = 0`

**Output:**  
`0`

---

## Algorithm Used: Counting Factors of 5

### Why Trailing Zeroes Appear:
A trailing zero is created whenever there is a factor of `10` in the number. Since `10 = 2 * 5`, to count trailing zeroes in `n!`, we need to count how many pairs of factors of `2` and `5` exist in the number. However, in any factorial, there are more factors of `2` than `5`, so the number of trailing zeroes is determined by how many `5`s are present.

### How the Algorithm Works:
1. For each multiple of `5`, there is at least one factor of `5`.
2. Additionally, for numbers that are multiples of `25`, there is an extra factor of `5`, and so on.
3. Thus, we repeatedly divide `n` by `5` and add the result to the count of trailing zeroes.

### Example:

Let’s take `n = 25`:

1. `25 / 5 = 5` → This gives 5 factors of `5`.
2. `25 / 25 = 1` → This gives 1 additional factor of `5`.

So, the number of trailing zeroes in `25!` is `5 + 1 = 6`.

---

## Step-by-Step Explanation with Visualization

Let’s take `n = 25`.

### Iteration Breakdown:

1. **Initial Value:**  
   `n = 25`, `count = 0`

2. **First Iteration:**  
   `n = 25 / 5 = 5`, `count = 0 + 5 = 5`

3. **Second Iteration:**  
   `n = 5 / 5 = 1`, `count = 5 + 1 = 6`

4. **Final Count:**  
   `count = 6`

The number of trailing zeroes in `25!` is `6`.

---

## Time and Space Complexity

- **Time Complexity:** `O(log n)`, since we divide `n` by `5` repeatedly until `n < 5`.
- **Space Complexity:** `O(1)`, as we use only a few extra variables to store the count of trailing zeroes.

---

## Java Code

```java
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
