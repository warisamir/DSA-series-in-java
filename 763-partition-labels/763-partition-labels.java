class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
         
                hm.put(c,i);
            
        }
        ArrayList<Integer>ls=new ArrayList<>();
      
        
     int e=0,sz=0;
        for(int i=0;i<s.length();i++){
            sz++;
            
            e=Math.max(e,hm.get(s.charAt(i)));
            if(i==e)
            {
                ls.add(sz);
                sz=0;
            }
        }
        return ls;
    }
}