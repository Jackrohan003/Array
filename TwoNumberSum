/*

Given an array of integers, return the indices of the two numbers whose sum is equal to a given target.

Given nums = [2, 7, 11, 15], target = 9.

The output should be [0, 1]. 
Because nums[0] + nums[1] = 2 + 7 = 9.


*/

import java.io.*;
import java.util.*;
class TwoNumberSum {
	public static void main (String[] args)
  {

     ArrayList<Integer> list = new ArrayList<Integer>();
	   
	   list.add(3);
	   list.add(2);
	   list.add(1);
	   
	   int target = 6;
	   
	   ArrayList <Integer> index = new ArrayList<Integer>();
	
    //Best Approach Time Complexity is O(n)

       HashMap<Integer,Integer> hmap = new HashMap<>();

         for(int i=0;i<list.size();i++)
         {
             int minus = target - list.get(i);

              if(hmap.containsKey(minus))
              {
                  index.add(i);
                  index.add(hmap.get(minus));
              }
              else
              {
                  hmap.put(list.get(i),i);
              }
         }
         if(index.size()==2)
         {
             System.out.println(index);
         }
         else
         {
             System.out.println("Target is not achieved !!");
         }
	}
  
  //Naive Approach O(n^2)
  private static int[] findTwoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
  /*
  METHOD 3. Use Sorting along with the two-pointer sliding window approach
There is another approach which works when you need to return the numbers instead of their indexes. Here is how it works:

Sort the array.
Initialize two variables, one pointing to the beginning of the array (left) and another pointing to the end of the array (right).
Loop until left < right, and for each iteration
if arr[left] + arr[right] == target, then return the indices.
if arr[left] + arr[right] < target, increment the left index.
else, decrement the right index.
This approach is called the two-pointer sliding window approach. It is a very common pattern for solving array related problems.
  
  */
  
   private static int[] findTwoSum_Sorting(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] == target) {
                return new int[] {nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
  
  
  
  
  
  
  
  
}
