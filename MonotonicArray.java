class Solution {
    public boolean isMonotonic(int[] arr) {
       
                if(arr.length <= 2){
        return true;
    }
    boolean increasing = true;
    boolean decreasing = true;
    for (int i=1; i<arr.length; i++){
        if (arr[i-1] > arr[i]){
            increasing = false;
        } else if(arr[i-1] < arr[i]){
            decreasing = false;
        }
        if (!increasing && !decreasing){
            return false;
        }
    }
    return true;        
    }
}

