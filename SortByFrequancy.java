
class Sorting
{
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        // add your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
            
        for(int a:arr)
        {
            if(map.containsKey(a)==false)
                map.put(a,1);
            else
                map.put(a,map.get(a)+1);
                list.add(a);
        }
        
        Sort s = new Sort(map);
        Collections.sort(list,s);
        
        return list;
        
    }
}
class Sort implements Comparator<Integer>
{
    Map<Integer, Integer> freq; 
    
    Sort(Map<Integer, Integer> tmap)
    { 
        this.freq = tmap;
    }
    public int compare(Integer k1, Integer k2)
    {
        int f = freq.get(k2).compareTo(freq.get(k1));
        int v = k1.compareTo(k2);
        
        if(f==0)
         return v;
        else
         return f;
    }
}
