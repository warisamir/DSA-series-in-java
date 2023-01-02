//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
            }
            Solution obj = new Solution();
            int ans = obj.findMotherVertex(V, adj);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find a Mother Vertex in the Graph.
    int []topo;
    int idx;
    void dfs(int src,ArrayList<ArrayList<Integer>>adj,boolean[] vis){
        if(vis[src]==true) return ;
        vis[src]=true;
        for(Integer nbr:adj.get(src))
            dfs(nbr,adj,vis);
            topo[idx--]=src;
        
    }
    void dfs2(int src,ArrayList<ArrayList<Integer>>adj,boolean vis[]){
         if(vis[src]==true) return ;
        vis[src]=true;
        for(Integer nbr:adj.get(src))
            dfs2(nbr,adj,vis);

    }
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        boolean vis[]=new boolean[V];
        idx=V-1;
        topo=new int[V];
        for(int i=0;i<V;i++){
        dfs(0,adj,vis);
        }
        Arrays.fill(vis,false);
        dfs2(topo[0],adj,vis);
        for(int i=0;i<V;i++){
            if(vis[i]==false)
            return -1;
        }
        
        return  topo[0];
    }
}