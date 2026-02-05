package ArrayProblems;

public class RangeSum {
    int[] prefix;

    public RangeSum(int[] nums) {
        prefix = new int[nums.length];
        prefix[0] = nums[0];
        System.out.println("prefix[0] = " + prefix[0]);

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
            System.out.println(
                    "prefix[" + i + "] = prefix[" + (i - 1) + "] + nums[" + i + "] = "
                            + prefix[i]
            );
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            System.out.println("Sum = prefix[" + right + "]");
            return prefix[right];
        }
        System.out.println(
                "Sum = prefix[" + right + "] - prefix[" + (left - 1) + "]"
        );
        return prefix[right] - prefix[left - 1];
    }


    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        RangeSum rs = new RangeSum(arr);
        System.out.println(rs.sumRange(1, 3));
    }
}

