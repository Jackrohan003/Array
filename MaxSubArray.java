/*
Find the contiguous subarray within an array, A of length N which has the largest sum.

Input 1:
    A = [1, 2, 3, 4, -10]

Output 1:
    10

Explanation 1:
    The subarray [1, 2, 3, 4] has the maximum possible sum of 10.

Input 2:
    A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

Output 2:
    6

Explanation 2:
    The subarray [4,-1,2,1] has the maximum possible sum of 6.


*/



public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> list) {
        int max = Integer.MIN_VALUE;
      int count = 0;

    for (int i = 0; i < list.size(); i++) {
        // Increment the counter with the current value
        count = count + list.get(i);

        if (count > max) {
            max = count;
        }

        // If count is negative, we simply get rid of the past
        if (count < 0) {
            count = 0;
        }
    }
    return max;
        
        
    }
}
