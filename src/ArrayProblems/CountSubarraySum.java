package ArrayProblems;

import java.util.HashMap;

public class CountSubarraySum {

    public static int countSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, count = 0;

        for (int num : nums) {
            System.out.println("sum "+sum+" num "+num);
            sum += num;
            System.out.println("sum "+sum+" sum - k "+(sum - k));
            count += map.getOrDefault(sum - k, 0);
            System.out.println("count "+count);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            System.out.println("map "+map);
            System.out.println("------------------------");
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(countSubarrays(arr, 3));
    }
}

