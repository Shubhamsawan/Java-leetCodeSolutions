package LeetCodeSlution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.
    You can return the answer in any order.*/

//    public static int[] twoSum(int[] nums, int target) {
//        // Create a HashMap to store numbers and their indices
//        Map<Integer, Integer> map = new HashMap<>();
//
//        // Loop through the array
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(i < nums.length);

//            int complement = target - nums[i]; // The number we need to find

//            // Check if complement already exists in the map
//            if (map.containsKey(complement)) {
//                // If yes, return current index and the stored index of complement
//                return new int[]{map.get(complement), i};
//            }
//            // Otherwise, store current number and its index
//            map.put(nums[i], i);
//        }
//
//        // If no solution is found (problem guarantees one, so not needed in practice)
//        throw new IllegalArgumentException("No two sum solution");
//    }

   // ✅ Normal / Brute-force Approach (O(n²) Time)

    public static int[] twoSum(int[] nums, int target) {
        // Loop through each pair of numbers
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if they add up to the target
                if (nums[i] + nums[j] == target) {
                    System.out.println("nums = " + nums[i] + ", nums[j] = " + nums[j]+" target "+ target);
                    System.out.println(i +" "+j);
                    return new int[] { i, j };
                }
            }
        }
        // If no pair found (though the problem guarantees one)
        return new int[] {};
    }

    // Example usage
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }



    //--------------Explanation-------------------//
  /*
  Explanation Step by Step

    Input:
    nums = [2, 7, 11, 15], target = 9

    Step 1: Create a HashMap
    We use map to store each number we have seen so far, mapping number → index.

    This helps us check instantly (in O(1) time) whether the "complement" of the current number exists in the array.

    Step 2: Iterate through nums

    i	nums[i]	target - nums[i]	map (before checking)	Action
    0	2	7	{}	7 not in map → add (2, 0)
    1	7	2	{2=0}	2 found in map → return [0, 1]

    Output: [0, 1] ✅
    Because nums[0] + nums[1] = 2 + 7 = 9

            🧩 Why HashMap?

    Reason: We need to quickly check if a number’s complement has already appeared.

    Without HashMap: We’d need a nested loop (O(n²) time).

    With HashMap: Lookup and insertion are O(1) on average.
            → Overall algorithm becomes O(n) time and O(n) space.

⏱ Time and Space Complexity
    Complexity	Explanation
    Time: O(n)	We visit each element once, and map lookups/inserts are O(1).
    Space: O(n)	We store up to n elements in the HashMap.
            🧾 Summary

    Data Structure Used: HashMap<Integer, Integer>

    Why: Allows constant-time lookup for complements

    Algorithm Steps:

    For each element, compute its complement.

            Check if complement is already in map.

    If yes → return indices.

    If no → add current number to map.

    Time Complexity: O(n)

    Space Complexity: O(n)
    */
}

