package InterviewQestions;

public class MoveZeros {

    public static void moveZeros(int[] arr) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[index];
                System.out.println(" temp "+temp);

                arr[index] = arr[i];
                System.out.println(" arr[index] "+arr[index]);

                arr[i] = temp;
                System.out.println(" arr[i] "+arr[i]);

                index++;
                System.out.println("_______ "+index+"___________");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

