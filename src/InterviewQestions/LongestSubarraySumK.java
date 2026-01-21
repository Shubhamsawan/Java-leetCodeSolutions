package InterviewQestions;

import java.util.HashMap;

public class LongestSubarraySumK {
    public static int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;

        // Base case
        map.put(0, -1);
        System.out.println(" map "+map);
        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];
            System.out.println(arr[i]+" prefixSum "+prefixSum);

            // Check if (prefixSum - k) exists
            if (map.containsKey(prefixSum - k)) {
                int length = i - map.get(prefixSum - k);
                System.out.println(" length "+length);

                maxLength = Math.max(maxLength, length);
                System.out.println(" maxLength "+maxLength);

            }

            // Store prefix sum only if first time
            map.putIfAbsent(prefixSum, i);
        }
        System.out.println("final maxLength "+maxLength);

        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(longestSubarray(arr, k)); // Output: 4
    }
}
