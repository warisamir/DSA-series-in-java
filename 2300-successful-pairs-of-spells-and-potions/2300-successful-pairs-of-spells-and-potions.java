class Solution {
    public int[] successfulPairs(int[] spell, int[] potions, long success) {
       Arrays.sort(potions);
          int arr[]=new int[spell.length];
        for(int i=0;i<spell.length;i++){
            arr[i]=bf(spell,potions,success,i);
        }
       return arr;
    }
    public int bf(int ar[],int p[],long sc,int k){
        int low=0;
        int high=p.length-1; 
        int num=0;
        while(low<=high){
            int mid=(low+high)/2;
            long a=(long)ar[k]*(long)p[mid];
            if(a>=sc){
                num=p.length-mid;
            high=mid-1;
            }
            else if(a<sc)
            {
                low =mid+1;
            }
        }
        return num;
    }
    
}