

public class RotateArray {
	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		 ArrayList<Integer> ret = new ArrayList<Integer>();
    
               if(B > A.size())
                B %= A.size();
        
    for(int i = B ; i< A.size();i++)
        ret.add(A.get(i));
  
    for(int j =0 ; j<B;j++)
        ret.add(A.get(j));

        return ret;
    }
}
