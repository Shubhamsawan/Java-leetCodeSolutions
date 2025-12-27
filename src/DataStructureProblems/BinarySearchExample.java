package DataStructureProblems;

public class BinarySearchExample {

//    Algorithm Steps:
//    Find the middle element.
//    If the middle element equals the target → found.
//    If the target < mid → search left half.
//            Else → search right half.
//    Repeat until low > high.

//            | Case    | Time Complexity     |
//            | ------- | ------------------- |
//            | Best    | Ω(1) — found at mid |
//            | Average | Θ(log n)            |
//            | Worst   | O(log n)            |


    public static int binarySearch(int[] arr, int key) {
        System.out.println(arr.length);
        int low = 0, high = arr.length - 1;
        System.out.println("1.1 low " + low + " high " + high);
        System.out.println("2.2 low <= high " + (low <= high));

        while (low <= high) {
            System.out.println("3.3 low " + low + " high " + high);
            int mid = (low + high) / 2;
            System.out.println("4.4 mid " + mid);
            System.out.println("5.5 arr[mid] " + arr[mid]);

            if (arr[mid] == key) {
                System.out.println("6.6 mid " + mid);

                return mid;  // found
            }else if (arr[mid] < key) {
                low = mid + 1;
                System.out.println("7.7 low " + low);
            }else {
                high = mid - 1;
                System.out.println("8.8 high " + high);
            }
        }
        System.out.println("low " + low);
        System.out.println("high " + high);

        return -1;  // not found
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int key = 40;
        int index = binarySearch(nums, key);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found!"+index);
    }
}
