class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[]=new int[nums.length];
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
       Arrays.fill(arr,-1);
        for(int i=0;i<nums.length*2;i++){
        while(!st.isEmpty() && nums[st.peek()]<nums[i%n])
            arr[st.pop()]=nums[i%n];
        if(i<n)
         st.push(i);
    }

    return arr;
    }
}