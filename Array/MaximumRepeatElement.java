 public class MaximumRepeatElement {
    public static void MaxRepeatElement(int[] arr) {
        int m = 0;  
        int MaxRepeat = arr[0];  
        for (int i = 0; i < arr.length; i++) {
            int c = 0;  
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c++;  
                }
            }
            if (c > m) {
                m = c;
                MaxRepeat = arr[i];
            }
        }
        System.out.println("The number with the maximum frequency is: " + MaxRepeat);
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 6, 5, 6, 5, 6}; 
        MaxRepeatElement(arr);
    }
}
 
