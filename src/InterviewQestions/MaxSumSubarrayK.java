package InterviewQestions;

public class MaxSumSubarrayK {

//    Dry Run
//
//    Array: [2, 1, 5, 1, 3, 2], K = 3
//    Window [2,1,5] → sum = 8
//    Window [1,5,1] → sum = 7
//    Window [5,1,3] → sum = 9  ← max
//    Window [1,3,2] → sum = 6

    public static int maxSum(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            System.out.println("---------------I--------------- ");
            System.out.println("1.1 arr[i] "+arr[i]);
            windowSum += arr[i];
            System.out.println("1.1 windowSum "+windowSum);
            System.out.println("---------------i--------------- ");

        }

        maxSum = windowSum;

        // sliding the window
        for (int i = k; i < arr.length; i++) {
            System.out.println("------------Slide------------------ ");
            windowSum += arr[i];       // add next element
            System.out.println("2.1 windowSum "+windowSum);
            windowSum -= arr[i - k];   // remove first element of window
            System.out.println("2.2 windowSum "+windowSum);
            maxSum = Math.max(maxSum, windowSum);
            System.out.println("maxSum "+maxSum);

            System.out.println("------------------------------ ");

        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Max Sum: " + maxSum(arr, k));
    }
}

