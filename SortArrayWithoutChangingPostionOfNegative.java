
/*
Given an array arr[] of N integers, the task is to sort the array without changing the position of negative numbers (if any)
i.e. the negative numbers need not be sorted.

*/


import java.io.*;
import java.util.*;

class SortArrayWithoutChangingPostionOfNegative {
	public static void main (String[] args) {
		
    int arr[] = { 2, -6, -3, 8, 4, 1 }; 
  
    int n = arr.length; 
  
    sortArray(arr, n); 
		
	}
	
	static void sortArray(int a[], int n) 
    {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<n;i++)
        {
            if(a[i]>=0)
            {
                list.add(a[i]);
            }
        }
        Collections.sort(list);
        
        int j = 0;
        
        for(int i=0;i<n;i++)
        {
            if(a[i]>=0)
            {
                a[i]=list.get(j);
                j++;
            }
        }
        
        for(int i:a)  
            System.out.println(i);
        
    }
}
