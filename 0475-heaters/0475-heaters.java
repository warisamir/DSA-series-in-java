class Solution {
    class Pair{
        int js,jl;
        Pair(int js,int jl){
            this.js=js;
            this.jl=jl;
        }
    }
        
    public int findRadius(int[] houses, int[] heaters) {
        int ans=0,max=0;
        Arrays.sort(heaters);
        for(int i=0;i<houses.length;i++){
            int hp=houses[i];
            Pair p=binarySearch(hp,heaters);
            int d1=(p.js==-1)?Integer.MAX_VALUE:hp-p.js;
            int d2=(p.jl==-1)?Integer.MAX_VALUE:p.jl-hp;
            max=Math.min(d1,d2);
            if(max>ans)
                ans=max;
        }
        return ans;
    }
    public  Pair binarySearch(int key,int arr[]){
        int lo=0;
        int hi=arr.length-1;
        Pair p=new Pair(-1,-1);
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==key){
           p.js=arr[mid];
            p.jl=arr[mid];
            
                break;
            }
            else if(arr[mid]<key){
                p.js=arr[mid];
                lo=mid+1;
            }
            else
            {
                p.jl=arr[mid];
                hi=mid-1;
            }
        }
        return p;
    }
}