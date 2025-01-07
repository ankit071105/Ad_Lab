import java.util.Arrays;

public class ArrayReduction {
    public static int[] reduceArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr; 
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 2, 0, 3}; 
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] reducedArr = reduceArray(arr);
        System.out.println("Reduced Array: " + Arrays.toString(reducedArr));
    }
}
