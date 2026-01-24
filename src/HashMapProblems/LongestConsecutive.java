package HashMapProblems;
import java.util.HashSet;

public class LongestConsecutive {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            System.out.println(" set "+set+" num "+num);
            System.out.println(" (num - 1) "+(num - 1));

            // start only if num-1 not present
            System.out.println(" (!set.contains(num - 1)) "+(!set.contains(num - 1)));
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr));
    }
}
