class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int dist[][]=new int[n][n];
        int inf=(int) 1e9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) dist[i][j]=0;
                else dist[i][j]= inf;
            }
        }
        for(int edge[]:edges){
            dist[edge[0]][edge[1]]=edge[2];
            dist[edge[1]][edge[0]]=edge[2];
        }
        for(int k=0;k<n;k++){
            for(int s=0;s<n;s++){
                for(int d=0;d<n;d++)
                    dist[s][d]=Math.min(dist[s][d],dist[s][k]+dist[k][d]);
            }
        }
        int ans=-1 ,reach=n;
        for(int s=0;s<n;s++){
            int ct=0;
            for(int d=0;d<n;d++){
                if(dist[s][d]<=distanceThreshold)
                ct++;
            }
            if(ct<=reach){
                reach=ct;
                ans=s;
            }
        }
        return ans;
    }
}