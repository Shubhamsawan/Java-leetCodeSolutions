package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElementArray {

    // Finds duplicates by modifying the array
// Works only if elements are in range 0 to n-1
    public int[] duplicateElementWithoutSpace(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            // If value at index is already negative, it's a duplicate
            if (arr[index] < 0) {
                System.out.println("1.1 Duplicate: " + index);
            } else {
                // Mark as visited
                arr[index] = -arr[index];
            }
        }

        return arr;
    }


    public int[] FindDuplicatesWithSpace(int[] arr) {
        HashSet<Integer> set = new HashSet<>();       // stores unique elements


        for (int num : arr) {
            if (!set.add(num)) {
//                duplicates.add(num);
                System.out.println(" Duplicate: " + num);
            }
        }
//        int[] result = new int[duplicates.size()];
//        for (int i = 0; i < duplicates.size(); i++) {
//            result[i] = duplicates.get(i);
//        }

        return arr;
    }

    public static void main(String[] args) {
        DuplicateElementArray duplicateElementArrayObj = new DuplicateElementArray();

//        int[] reverseArray = {1, 2, 3, 1, 3, 6, 6};
//        int[] duplicateElementWithoutSpace = duplicateElementArrayObj.duplicateElementWithoutSpace(reverseArray);
//        System.out.println(" duplicateElementWithoutSpace " + Arrays.toString(duplicateElementWithoutSpace));

        int[] reverseArrays = {1, 2, 3, 1, 3, 6, 6};
        int[] duplicateElementWithSpace = duplicateElementArrayObj.FindDuplicatesWithSpace(reverseArrays);
        System.out.println(" duplicateElementWithSpace " + Arrays.toString(duplicateElementWithSpace));
    }
}
