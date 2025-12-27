package ArrayProblems;

import java.util.Arrays;

public class SecondLargestInArray {

    public void secondLargestWithoutSpace(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        System.out.println("1.1 largest " + largest + " secondLargest " + secondLargest);
        for (int num : arr) {
            System.out.println("2.2 --->  num " + num + " largest " + largest + " secondLargest " + secondLargest);
            System.out.println("3.3-->num > largest " + (num > largest) + " num>secondLargest " + (num > secondLargest) + "<------------");

            if (num > largest) {
                secondLargest = largest;
                largest = num;
                System.out.println("4.4 largest " + largest + " secondLargest " + secondLargest);

            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
                System.out.println("5.5 secondLargest " + secondLargest);
            }
        }
        System.out.println("6.6 Second Largest: " + secondLargest);

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
