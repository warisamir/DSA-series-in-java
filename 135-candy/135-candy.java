class Solution {
    public int candy(int[] ratings) {
    int can[]=new int[ratings.length];
        can[0]=1;
        for(int i=1;i<ratings.length;i++){
           if(ratings[i]>ratings[i-1]) 
               can[i]=can[i-1]+1;
            if(can[i]==0)can[i]=1;
        }
        int ans=can[ratings.length-1];
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])
                can[i]=Math.max(can[i+1]+1,can[i]);
            ans+=can[i];
        }
        return ans;
    }
}