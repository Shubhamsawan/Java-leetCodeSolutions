package InterviewQestions;

import java.util.HashMap;

public class LongestSubarraySumK {
    public static int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;

        // Base case
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            // Check if (prefixSum - k) exists
            if (map.containsKey(prefixSum - k)) {
                int length = i - map.get(prefixSum - k);
                maxLength = Math.max(maxLength, length);
            }

            // Store prefix sum only if first time
            map.putIfAbsent(prefixSum, i);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(longestSubarray(arr, k)); // Output: 4
    }
}
