public class LongestSumContiguous {
        public static int findMaxSum(int[] arr) {
            int maxSoFar = Integer.MIN_VALUE;
            int currentMax = 0;              
    
            for (int num : arr) {
                currentMax += num;
                if (currentMax > maxSoFar) {
                    maxSoFar = currentMax;
                }
                if (currentMax < 0) {
                    currentMax = 0; 
                }
            }
            return maxSoFar;
        }  
        public static void main(String[] args) {
            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            
            int maxSum = findMaxSum(arr);
            System.out.println("Maximum Sum of Contiguous Subarray: " + maxSum);
        }
    }
      

