package ArrayProblems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SimpleArrays {

    //Logics
    public int[] reverse(int[] reversal) {
        int start = 0, end = reversal.length - 1;

        while (start < end) {
            int temp = reversal[start];
            reversal[start] = reversal[end];
            reversal[end] = temp;

            start++;
            end--;


        }
        return reversal;
    }

    public int largeElement(int[] largeEle) {

        int max = largeEle[0];
        for (int i = 0; i < largeEle.length; i++) {
            if (largeEle[i] > max) {
                max = largeEle[i];
            }
        }
        return max;
    }




    public static void main(String[] args) {
        int[] reversal = {1, 2, 3, 4};
        SimpleArrays simpleArrays = new SimpleArrays();
        // Reverse Array
        int[] reverse = simpleArrays.reverse(reversal);
        System.out.println(" reverse " + Arrays.stream(reverse).mapToObj(String::valueOf).collect(Collectors.joining(" ")));

        //    Arrays.stream(int[]) → creates an IntStream
        //    mapToObj(String::valueOf) → converts int to String
        //    Collectors.joining(" ") → joins elements with space

        //Largest element
        int largestArr = simpleArrays.largeElement(reversal);
        System.out.println(" largestElement  " + largestArr);
    }


}
