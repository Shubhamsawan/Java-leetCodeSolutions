package HashMapProblems;

import java.util.HashMap;

public class SubarraySumK {

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // important base case

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            System.out.println(" sum "+sum+" num "+num);
            sum += num;
            System.out.println(sum+" sum - k---> " +(sum - k)+" map.containsKey(sum - k) "+(map.containsKey(sum - k)));
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
                System.out.println("count>>>>> "+count);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            System.out.println("map "+map);

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subarraySum(arr, 3));
    }
}
