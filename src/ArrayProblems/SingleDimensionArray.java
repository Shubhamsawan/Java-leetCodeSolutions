package ArrayProblems;

import java.util.Arrays;

public class SingleDimensionArray {

    int arr[]=null;

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i=0; i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }



    public void insert(int location, int valueToInserted){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToInserted;
                System.out.println("Successfully Inserted "+arr[location]);
            }else{
                System.out.println("This cell is already occupied!"+arr[location]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!"+arr[location]);
        }
    }

    public static void main(String[] args) {
        SingleDimensionArray single = new SingleDimensionArray(10);
        single.insert(0,10);
        single.insert(1,20);
        single.insert(2,30);
         var firstElement = single.arr[0];
        System.out.println(firstElement);

    }
}
