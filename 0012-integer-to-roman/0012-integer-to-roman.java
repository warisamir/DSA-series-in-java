class Solution {
    public String intToRoman(int n) {
       String  s=Integer.toString(n);
        StringBuffer sb=new StringBuffer();
        char m[]=new char[7];
        m[0]='I';
        m[1]='V';
        m[2]='X';
        m[3]='L';
        m[4]='C';
        m[5]='D';
        m[6]='M';
        int l=s.length(),i=l*2,sm=0;
     while((i-=2)>=0){
         int d=s.charAt(sm++)-'0';
         if(d%5==4) sb.append(m[i]).append(m[i+d/5+1]);
         else{
             if(d>=5) sb.append(m[i+1]);
             d%=5;
             while(d-->0)sb.append(m[i]);
         }
     }  
        return sb.toString();
    }
}