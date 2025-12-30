package ArrayProblems;

public class RotateArrayInPlace {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        k = k % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static class RotateArrayWithSpace {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int k = 2;
            int[] temp = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                temp[(i + k) % arr.length] = arr[i];
            }

            for (int n : temp) {
                System.out.print(n + " ");
            }
        }
    }

}

