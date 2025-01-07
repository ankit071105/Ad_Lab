public class LinearSearchRecursion {
    public static int linearSearch(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return linearSearch(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 6};
        int target = 8;
        int result = linearSearch(arr, target, 0);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
