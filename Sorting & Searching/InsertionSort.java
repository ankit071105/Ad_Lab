import java.util.Arrays;
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6}; 
        System.out.println("Original Array:");
        printArray(arr);
        insertionSort(arr);
        System.out.println("Sorted Array:");
        printArray(arr);
    }

}
