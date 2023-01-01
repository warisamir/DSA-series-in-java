class Solution {
    public String getHint(String s, String g) {
      
        int ar[]=new int[12];
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-'0';
              int b= g.charAt(i)-'0';
            if(a!=b){
                if(ar[a]<0) ar[10]++;
                if(ar[b]>0) ar[10]++;
                ar[a]++;ar[b]--;
            }
            else
                ar[11]++;
        }
        return Integer.toString(ar[11])+"A"+Integer.toString(ar[10])+"B";
    }
}