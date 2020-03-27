
import java.io.*;

class ZigzagPrint {
    
    public static void print(int a[][],int row,int col)
    {
        int evenRow = 0;
        int oddRow = 1;
        
        while(evenRow < row)
        {
            for(int i=0;i<col;i++)
            {
                System.out.print(a[evenRow][i] + "  ");
            }
            
            evenRow= evenRow+2;
            
            if(oddRow < row)
            {
                for(int i=col-1;i>=0;i--)
                {
                    System.out.print(a[oddRow][i]+"  ");
                }
            }
            oddRow=oddRow+2;
        }
    }
    
    
	public static void main (String[] args) 
	{
	     int r = 3, c = 5; 
  
        int mat[][] = { {1, 2, 3, 4, 5}, 
                         {6, 7, 8, 9, 10}, 
                         {11, 12, 13, 14, 15}}; 	
                         
            print(mat,r,c);             
                         
                    
	}
}