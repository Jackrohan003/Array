//Find duplicates in O(n) time and O(1) extra space 

class FindDuplicates {
  public static void main(String[] args) {
     int numRay[] = {0, 4, 3, 2, 7, 8, 2, 3, 1}; 
        for (int i = 0; i < numRay.length; i++) { 
            numRay[numRay[i] %  numRay.length] = numRay[numRay[i] %  numRay.length] + numRay.length; 
        } 
        for (int i = 0; i < numRay.length; i++)  
                System.out.print(numRay[i]+" ");
           
        System.out.println("\nThe repeating elements are : "); 
        for (int i = 0; i < numRay.length; i++) { 
            if (numRay[i] >= numRay.length*2) { 
                System.out.println(i + " "); 
            } 
        }  
  }
}
