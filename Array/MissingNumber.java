public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int e = n * (n + 1) / 2;
        int s = 0;
        for (int i=0; i<arr.length; i++) {
            s += arr[i];
        }
        return e - s;
    }
        public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5}; 
        int n = 5;
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
