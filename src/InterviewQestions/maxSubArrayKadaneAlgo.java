package InterviewQestions;

public class maxSubArrayKadaneAlgo {

    public static int maxSubArray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // how it works
//            Step 1: Start from the left
// [-2]
//            Sum = -2  ❌ (bad, negative)
//👉 Negative sum is not useful, so we drop it.
// [ 1 ]
//            Sum = 1  ✅
//            Add next element:
//[ 1  -3 ]
//            Sum = -2  ❌
//            👉 Sum became negative → throw this subarray away
//            [ 4 ]
//            Sum = 4  ✅
//            Add next numbers one by one:
//[ 4  -1 ]        Sum = 3  ✅
//[ 4  -1   2 ]    Sum = 5  ✅
//[ 4  -1   2   1 ]Sum = 6  ✅ (BEST)


            currentSum = Math.max(arr[i], currentSum + arr[i]);
            System.out.println("currentSum "+currentSum);

            maxSum = Math.max(maxSum, currentSum);
            System.out.println("maxSum "+maxSum);

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1,-5,4};
        int i = maxSubArray(arr);
        System.out.println("max sub array " + i);
    }
}
