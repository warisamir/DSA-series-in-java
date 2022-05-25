class Solution {
    public boolean checkIfPangram(String s) {
       
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
    if(hm.size()>=26)
        return true;
        else return false;
    }
}