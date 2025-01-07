import java.util.Arrays;
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
 }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6}; 
        System.out.println("Original Array:");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted Array:");
        printArray(arr);
    }

}
