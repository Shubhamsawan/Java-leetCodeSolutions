package LeetCodeSlution;

import java.util.Arrays;

public class MedianOfTwoSortedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        System.out.println(" m " + m + " n " + n);
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;
        System.out.println(" 1. merged " + Arrays.toString(merged));

        // Merge both arrays
        while (i < m && j < n) {
            System.out.println(" nums1[i] "+ nums1[i]+" nums2[j] "+nums2[j]);
            if (nums1[i] < nums2[j]) {
                System.out.println("merged[k++] = nums1[i++] " + (merged[k++] = nums1[i++]));
                System.out.println(" 2. merged " + Arrays.toString(merged));
            } else {
                System.out.println("merged[k++] = nums1[i++] " + (merged[k++] = nums2[j++]));
                System.out.println(" 3. merged " + Arrays.toString(merged));
            }
        }

        // Add remaining elements
        while (i < m) merged[k++] = nums1[i++];
        while (j < n) merged[k++] = nums2[j++];

        // Find median
        int total = m + n;
        if (total % 2 == 1) {
            return merged[total / 2];
        } else {
            return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double sorAra = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median of two sorted array " + sorAra);
    }
}
