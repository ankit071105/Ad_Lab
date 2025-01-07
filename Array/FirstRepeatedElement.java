import java.util.*;

public class FirstRepeatedElement {
    public static int FirstsRepeatedElement(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 5, 7, 8};
        int result = FirstsRepeatedElement(arr);
        if (result != -1) {
            System.out.println("The first repeated element is: " + result);
        } else {
            System.out.println("No repeated element found.");
        }
    }
}
