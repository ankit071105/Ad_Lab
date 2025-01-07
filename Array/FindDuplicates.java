import java.util.*;
public class FindDuplicates {
    public static void findDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        boolean hasDuplicates = false;
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println("Duplicate found: " + num);
                hasDuplicates = true;
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 5, 7, 8, 6};
        findDuplicates(arr);
    }
}
