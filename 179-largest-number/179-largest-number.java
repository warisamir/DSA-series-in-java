class Solution {
    public String largestNumber(int[] nums) {
       String s="";
        String sarr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            sarr[i]=nums[i]+"";
        }
        Arrays.sort(sarr,(a,b)->{
            String s1=a+b;
            String s2=b+a; 
        return s2.compareTo(s1);
            });
        if(sarr[0].equals("0"))
            return "0";
        StringBuilder sb=new StringBuilder();
        for(String st:sarr){
            sb.append(st);
        }
        return sb.toString();
    }
}