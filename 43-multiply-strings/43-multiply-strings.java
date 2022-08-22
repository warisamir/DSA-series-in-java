import java.math.BigInteger;
class Solution {
    public String multiply(String m1, String m2) {

//    
      BigInteger s1,s2;
        s1=new BigInteger(m1);
        s2=new BigInteger(m2);
      return  (s1.multiply(s2)).toString();}
    //     if(m1=="" || m2=="")return "0";
    //     int n=m1.length();
    //     int m=m2.length();
    //     int res[]=new int[n+m];
    //     for(int i=n-1;i>=0;i--){
    //      for(int j=m-1;j>=0;j--){
    //          int mul=(m1.charAt(i)-'0')*(m2.charAt(j)-'0');
    //         int  p1=i+j;
    //         int  p2=i+j+1;
    //          int sum=mul+res[p2];
    //          res[p2]=sum%10;
    //          res[p1]+=sum/10;
    //         }
    //     }
    //     int i=0;
    //     while(i<m+n && res[i]==0)
    //         i++;
    //     StringBuilder sb=new StringBuilder();
    //     for(;i<m+n;i++){
    //         sb.append(String.valueOf(res[i]));
    //     }
    //     return (sb.toString().equals("")?"0":sb.toString());
    // }
}
    
