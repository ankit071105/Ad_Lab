import java.util.*;
import java.util.stream.*;
public class SmallestMissingPositive {
    public static int findSmallestMissingPositive(int[] nums) {
        Set<Integer> numSet = Arrays.stream(nums)
                                    .filter(x -> x > 0) 
                                    .boxed()
                                    .collect(Collectors.toSet());
        for (int i = 1; i <= nums.length + 1; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }
        return -1; 
    }
        public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println("Smallest Missing Positive: " + findSmallestMissingPositive(nums));
    }
}

