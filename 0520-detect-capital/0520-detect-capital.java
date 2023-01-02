class Solution {
    public boolean detectCapitalUse(String w) {
        int upp=0,low=0;
        boolean first=false;
        for(int i=0;i<w.length();i++) 
        {
         if(Character.isUpperCase(w.charAt(i)) && i==0) 
         {first= true;
            upp++;
        }
        else if(Character.isUpperCase(w.charAt(i)))
        {
            upp++;
        }
        else low++;
        }   
        if(upp==w.length())
            return true;
        else if(low==w.length())
            return true;
        else if(first==true &&low==w.length()-1)
            return true;
        else 
            return false;
    
}
}