class Solution {
    public int minimumSwap(String s1, String s2) {
       if(s1.length()!=s2.length())
           return -1;
        int f1=0,f2=0,ct=0;
        for(int i=0;i<s1.length();i++){
          char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1!=ch2 && ch1=='x' && ch2=='y')
                f1++;
            else if(ch1!=ch2 && ch1=='y' && ch2=='x')
                f2++;
        }
        if((f1+f2)%2==1)return -1;
        else{
            return f1/2+f1%2 +f2/2+f2%2;
        }
        // return -1;
    }
}