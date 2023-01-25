class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
       int n = edges.length;
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];
        Arrays.fill(dist1, Integer.MAX_VALUE); 
        Arrays.fill(dist2, Integer.MAX_VALUE);
        
        dist1[node1] = dist2[node2] = 0;

        dfs(edges, node1, dist1);
        dfs(edges, node2, dist2);

        int minDistNode = -1;
        int minDistSoFar = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int maxDistBetweenTwo = Math.max(dist1[i], dist2[i]);
            if (maxDistBetweenTwo < minDistSoFar) {
                minDistSoFar = maxDistBetweenTwo;
                minDistNode = i;
            }
        }

        return minDistNode;
    }

    private void dfs(int[] edges, int currNode, int[] dist) {
        int nextNode = edges[currNode];
        if (nextNode != -1 && dist[nextNode] == Integer.MAX_VALUE) {
            dist[nextNode] = 1 + dist[currNode];
            dfs(edges, nextNode, dist);
        }
    }
}