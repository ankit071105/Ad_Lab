public class MinMaxPair {
    public static void findMinMaxPair(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The pair with the minimum and maximum values is: (" + min + ", " + max + ")");
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 3, 9, 2};  
        findMinMaxPair(arr);
    }
}
