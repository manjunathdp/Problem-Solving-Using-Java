package integers._01;

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

public class FizzBuzz {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        System.out.println("Example 1 (n = 3): " + solution.fizzBuzz(3));

        // Example 2
        System.out.println("Example 2 (n = 5): " + solution.fizzBuzz(5));

        // Example 3
        System.out.println("Example 3 (n = 15): " + solution.fizzBuzz(15));
    }
}
