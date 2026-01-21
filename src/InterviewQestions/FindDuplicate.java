package InterviewQestions;

import java.util.HashSet;

public class FindDuplicate {

    public static void findDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
//        HashSet does not allow duplicates.
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println("Duplicate: " + num);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        findDuplicate(arr);
    }
}