class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer>ans=new ArrayList<>();
           if (mat.length == 0)
            return ans;
        int row = mat.length, col = mat[0].length;
       int l=0,r=col-1,t=0,c=row-1,d=0;

        while(l<=r && t<=c)
        {
            if(d==0){
        for(int i=l;i<=r;i++){
            ans.add(mat[t][i]);
        }
                d=1;
                t++;
            }
            else if(d==1){
                for(int i=t;i<=c;i++)
                    ans.add(mat[i][r]);
                d=2;
                r--;
            }
            else if(d==2){
                for(int i=r;i>=l;i--)
                    ans.add(mat[c][i]);
                d=3;
                c--;
            }
            else if(d==3){
                for(int i=c;i>=t;i--)
                    ans.add(mat[i][l]);
            
            d=0;l++;
            }
        }
    return ans;
    }
}