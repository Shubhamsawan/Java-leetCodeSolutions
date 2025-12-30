package ArrayProblems;

public class MoveZerosInPlace {

    public void MoveZerosInPlaceWithoutSpace(int[] arr) {

        int index = 0;

        // Move non-zero elements forward
        for (int num : arr) {
            System.out.println(" num " + num);
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Fill remaining positions with zero
        while (index < arr.length) {
            arr[index++] = 0;
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }


    public static void main(String[] args) {
        MoveZerosInPlace moveZerosInPlace = new MoveZerosInPlace();
        int[] arr = {0, 1, 0, 3, 12};
        moveZerosInPlace.MoveZerosInPlaceWithoutSpace(arr);

    }
}
