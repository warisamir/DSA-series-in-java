class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
       String s2 = "";
        for(int index = 0;index < word1.length;index++)
        {
    
    
            s1 += word1[index];
        }
        for(int index = 0;index < word2.length;index++)
        {
    
    
            s2 += word2[index];
        }
        return s1.equals(s2);
    }
}