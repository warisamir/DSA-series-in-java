class Solution {
    public String largestNumber(int[] nums) {
        String arr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        StringBuilder sb=new StringBuilder();
        for(String st:arr)sb.append(st);
        int id=0;
        while(id<sb.length() && sb.charAt(id)=='0')
            id++;
        if(id==sb.length()) return "0";
        return sb.toString().substring(id);
    }
}