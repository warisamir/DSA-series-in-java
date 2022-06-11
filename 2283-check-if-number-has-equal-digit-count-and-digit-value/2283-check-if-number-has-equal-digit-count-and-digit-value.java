class Solution {
    public boolean digitCount(String num) {
        int []ct=new int[10];
        for(char c:num.toCharArray())
            ++ct[c-'0'];
        for(int i=0;i<num.length();i++)
            if(ct[i]!=num.charAt(i)-'0')
                return false;
        
        return true;
    }
}