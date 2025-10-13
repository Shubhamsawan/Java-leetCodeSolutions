package DataStructureProblems;

public class LinearSearchExample {

//    Algorithm Steps:
//    Start from the first element.
//    Compare each element with the target.
//    If found → return the index.
//    If the list ends → element not present.

//    Complexity Analysis:
//    Best case (Ω): element found at first position → Ω(1)
//    Worst case (O): element not found or at last position → O(n)
//    Average case (Θ): element somewhere in the middle → Θ(n)

    public static int linearSearch(int[] arr, int key) {
        System.out.println(arr.length );
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(i);

            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int key = 50;
        int index = linearSearch(nums, key);
        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found!"+ index);
    }
}
