class Solution {
    public List<String> wordBreak(String s, List<String> wordD) {
        Node root = new Node();
        for (String word : wordD) {
            insert(word, root);
        }
        List<String> res = new ArrayList<>();
        helper(s, root, new StringBuilder(), res);
        return res;
    }
    
    private void helper(String s, Node root, StringBuilder sb, List<String> res) {
        if (s.isEmpty()) {
     
            sb.setLength(sb.length() - 1);
            res.add(sb.toString());
            return;
        }
        int length = sb.length();
        Node node = root;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (node.child[c-'a'] == null) {
                return;
            }
            node = node.child[c-'a'];
            if (node.word != null) {
                sb.append(node.word).append(" ");
                helper(s.substring(i+1), root, sb, res);
                sb.setLength(length);
            }
        }
    }
    
    private void insert(String word, Node root) {
        Node node = root;
        for (char c : word.toCharArray()) {
            if (node.child[c-'a'] == null) {
                node.child[c-'a'] = new Node();
            }
            node = node.child[c-'a'];
        }
        node.word = word;
    }
}

class Node {
    Node[] child;
    String word;
    
    public Node() {
        this.child = new Node[26];
        this.word = null;
    }
    
}