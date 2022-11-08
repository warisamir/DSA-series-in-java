class Solution {
    public int nextGreaterElement(int n) {
        String s=String.valueOf(n);
        char arr[]=s.toCharArray();
        //find first dip
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i==-1)return -1;
        //find just greater ith elemnt
        int k=arr.length-1;
        while(arr[i]>=arr[k])
            k--;
         char tem=arr[i];
        arr[i]=arr[k];
        arr[k]=tem;
        String res="";
        for(int j=0;j<=i;j++)
            res+=arr[j];
        for(int j=arr.length-1;j>i;j--)
            res+=arr[j];
         
   try{
        int ans=Integer.parseInt(res);
        return ans;
    }catch(Exception e){
        return -1;
    }
    }
}