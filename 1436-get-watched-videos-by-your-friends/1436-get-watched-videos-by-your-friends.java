import java.util.*;

class Solution {
    public class Graph implements Comparable<Graph> {
        int src, dist;
        Graph(int src, int dist) {
            this.src = src;
            this.dist = dist;
        }

        public int compareTo(Graph other) {
            return Integer.compare(this.dist, other.dist);
        }
    }

    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        int n = watchedVideos.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Graph> pq = new PriorityQueue<>();
        dist[id] = 0;
        pq.offer(new Graph(id, 0));

        while (!pq.isEmpty()) {
            Graph p = pq.poll();
            int u = p.src;
            int time = p.dist;

            for (int v : friends[u]) {
                if (dist[v] > time + 1) {
                    dist[v] = time + 1;
                    pq.offer(new Graph(v, dist[v]));
                }
            }
        }

        Map<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (dist[i] == level) {
                for (String video : watchedVideos.get(i)) {
                    hm.put(video, hm.getOrDefault(video, 0) + 1);
                }
            }
        }

        List<String> result = new ArrayList<>(hm.keySet());
        result.sort((a, b) -> {
            int comp = Integer.compare(hm.get(a), hm.get(b));
            return comp != 0 ? comp : a.compareTo(b);
        });

        return result;
    }
}
