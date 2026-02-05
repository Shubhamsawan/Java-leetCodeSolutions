package ArrayProblems;

import java.util.*;

public class FirstNegative {

    public static void firstNegative(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            if (arr[end] < 0)
                q.add(arr[end]);

            if (end - start + 1 == k) {
                System.out.print(q.isEmpty() ? "0 " : q.peek() + " ");

                if (!q.isEmpty() && arr[start] == q.peek())
                    q.poll();
                start++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        firstNegative(arr, 3);
    }
}
