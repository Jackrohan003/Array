/*Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
*/

import java.io.*;

class RemoveDuplicates {
	
     public static int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i=1; i < nums.length; i++)
            if(nums[i] != nums[index])
                nums[++index] = nums[i];
                
        return index+1;//new length is index+1
    }
	

	public static void main (String[] args) {
	    
	    int a[] = {0,0,0,2,3,4,4,5};
	    
	    int k = removeDuplicates(a);
	    
	    for(int x:a)
        System.out.print(x);
	    
	     System.out.println(k);
	    
	}
}
