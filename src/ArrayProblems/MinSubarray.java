package ArrayProblems;

//Smallest Subarray With Sum ≥ Target

public class MinSubarray {

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            System.out.println("Added nums[" + right + "] = " + nums[right] + ", sum = " + sum);

            while (sum >= target) {
                int windowLen = right - left + 1;
                minLen = Math.min(minLen, windowLen);

                System.out.println(
                        "  Window [" + left + "," + right + "] length=" + windowLen +
                                " → minLen=" + minLen
                );

                sum -= nums[left];
                System.out.println("  Removed nums[" + left + "] = " + nums[left] + ", sum = " + sum);
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }


    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, nums));
    }
}
