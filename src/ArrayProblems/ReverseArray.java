package ArrayProblems;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            System.out.println(" temp " + temp);
            arr[start] = arr[end];
            System.out.println(" arr[start] " + arr[start]);
            arr[end] = temp;
            System.out.println(" arr[end] " + arr[end]);

            start++;
            end--;
        }
        for (int n : arr) {
            System.out.println("Reverse array " + n);
        }
    }
}
