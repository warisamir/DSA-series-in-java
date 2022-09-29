class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l=0;
        int r=arr.length-1;
        while(r-l>=k){
            if(Math.abs(arr[r]-x)>=Math.abs(arr[l]-x))
            {
                r--;
            }
            else{
                l++;
            }
        }
        
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=l;i<=r;i++){
            ls.add(arr[i]);
        }
        return ls;
    }
    
}