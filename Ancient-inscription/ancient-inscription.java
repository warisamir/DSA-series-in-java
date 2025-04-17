
class Graph {
    private final int ALPHABET_SIZE = 26;
    private List<Integer>[] adj;
    private int[] indegree;
    public Graph() {
        adj = new ArrayList[ALPHABET_SIZE];
        indegree = new int[ALPHABET_SIZE];
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            adj[i] = new ArrayList<>();
            indegree[i] = -1;  
        }
    }
    public void addChar(char c) {
        int idx = c - 'a';
        if (indegree[idx] == -1) indegree[idx] = 0;
    }
    public void addEdge(char from, char to) {
        int u = from - 'a';
        int v = to - 'a';
        if (!adj[u].contains(v)) {
            adj[u].add(v);
            indegree[v]++;
        }
    }
    public String topologicalSort() {
        StringBuilder result = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            result.append((char)(curr + 'a'));
            for (int neighbor : adj[curr]) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }
        int used = 0;
        for (int i = 0; i < 26; i++) {
            if (indegree[i] != -1) used++;
        }

        return result.length() == used ? result.toString() : "";
    }
}

public class Solution {
    public String inscripton(String[] words) {
        Graph graph = new Graph();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                graph.addChar(c);
            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i];
            String w2 = words[i + 1];
            int minLen = Math.min(w1.length(), w2.length());
            if (w1.startsWith(w2) && w1.length() > w2.length()) {
                return ""; 
            }
            for (int j = 0; j < minLen; j++) {
                if (w1.charAt(j) != w2.charAt(j)) {
                    graph.addEdge(w1.charAt(j), w2.charAt(j));
                    break;
                }
            }
        }
        return graph.topologicalSort();
    }
}
