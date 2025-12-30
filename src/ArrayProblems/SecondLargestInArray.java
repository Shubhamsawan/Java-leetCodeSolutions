package ArrayProblems;

import java.util.Arrays;

public class SecondLargestInArray {

    public void secondLargestWithoutSpace(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {


            if (num > largest) {
                secondLargest = largest;
                largest = num;

            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
    }

    public void secondLargestWithSpace(int[] arr) {
        Arrays.sort(arr);
        System.err.println(arr.length - 2);

        System.err.println("Second Largest: " + arr[arr.length - 2]);
    }


    public static void main(String[] args) {
        SecondLargestInArray secondLargestInArray = new SecondLargestInArray();

        int[] arr = {10, 5, 20, 8};
        secondLargestInArray.secondLargestWithoutSpace(arr);

        int[] spaceArr = {10, 5, 20, 8};
        secondLargestInArray.secondLargestWithSpace(spaceArr);


    }
}
