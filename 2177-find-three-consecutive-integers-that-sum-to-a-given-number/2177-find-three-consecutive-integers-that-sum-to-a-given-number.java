class Solution {
    public long[] sumOfThree(long num) {
//         HashMap<Integer,Integer>hm=new HashMap<>();
//         int prev=0;
//         for(int i=3;i<num;i++){
//             hm.put(i,prev++);
//         }
        
        Long a[]=new Long[3];
        if(num%3!=0)
            return new long[]{};
        else
        num/=3;
       return new long[]{num-1,num,num+1};
        
    }
}