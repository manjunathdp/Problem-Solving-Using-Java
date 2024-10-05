# FizzBuzz - Solution Explanation

## Question

**Problem:**  
Given an integer `n`, return a string array `answer` (1-indexed) where:

- `answer[i] == "FizzBuzz"` if `i` is divisible by `3` and `5`.
- `answer[i] == "Fizz"` if `i` is divisible by `3`.
- `answer[i] == "Buzz"` if `i` is divisible by `5`.
- `answer[i] == i` (as a string) if none of the above conditions are true.

### Example 1:
**Input:**  
`n = 3`

**Output:**  
`["1","2","Fizz"]`

### Example 2:
**Input:**  
`n = 5`

**Output:**  
`["1","2","Fizz","4","Buzz"]`

### Example 3:
**Input:**  
`n = 15`

**Output:**  
`["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]`

---

## Algorithm Used: Iteration and Conditionals

This algorithm iterates through numbers from `1` to `n` and applies conditional checks to determine the appropriate string to append to the answer list.

---

## Step-by-Step Explanation

Let’s take the example `n = 15`.

### Iteration Breakdown:

- For `i = 1`: Not divisible by `3` or `5` → add `"1"`
- For `i = 2`: Not divisible by `3` or `5` → add `"2"`
- For `i = 3`: Divisible by `3` → add `"Fizz"`
- For `i = 4`: Not divisible by `3` or `5` → add `"4"`
- For `i = 5`: Divisible by `5` → add `"Buzz"`
- For `i = 6`: Divisible by `3` → add `"Fizz"`
- For `i = 7`: Not divisible by `3` or `5` → add `"7"`
- For `i = 8`: Not divisible by `3` or `5` → add `"8"`
- For `i = 9`: Divisible by `3` → add `"Fizz"`
- For `i = 10`: Divisible by `5` → add `"Buzz"`
- For `i = 11`: Not divisible by `3` or `5` → add `"11"`
- For `i = 12`: Divisible by `3` → add `"Fizz"`
- For `i = 13`: Not divisible by `3` or `5` → add `"13"`
- For `i = 14`: Not divisible by `3` or `5` → add `"14"`
- For `i = 15`: Divisible by `3` and `5` → add `"FizzBuzz"`

---

### Final Result:
The resulting array for `n = 15` is **["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]**.

---

## Time and Space Complexity

- **Time Complexity:** `O(n)`, where `n` is the input integer.
- **Space Complexity:** `O(n)`, as we create a list to store the results.

---

## Java Code

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}
