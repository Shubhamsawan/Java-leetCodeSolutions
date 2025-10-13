package DataStructureProblems;

public class BubbleSortExample {

//    Algorithm Steps:
//    Compare adjacent pairs (arr[j] and arr[j+1]).
//    If arr[j] > arr[j+1], swap them.
//    After first pass, the largest element is at the end.
//            Repeat for remaining (n-1) elements.

//            | Case    | Time Complexity | Description               |
//            | ------- | --------------- | ------------------------- |
//            | Best    | Ω(n)            | Already sorted (no swaps) |
//            | Average | Θ(n²)           | Random order              |
//            | Worst   | O(n²)           | Reverse order             |


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // optimization
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // already sorted
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 4, 2, 8};
        bubbleSort(nums);
        System.out.print("Sorted array: ");
        for (int num : nums)
            System.out.print(num + " -> ");
    }
}
