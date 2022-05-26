class Node{
        public Node[] children = new Node[26];
  public boolean isWord = false;
}

class Trie {
  public void insert(String word) {
    Node node = root;
    for ( char c : word.toCharArray()) {
       int i = c - 'a';
      if (node.children[i] == null)
        node.children[i] = new Node();
      node = node.children[i];
    }
    node.isWord = true;
  }

  public boolean search(String word) {
    Node node = find(word);
    return node != null && node.isWord;
  }

  public boolean startsWith(String prefix) {
    return find(prefix) != null;
  }

  private Node root = new Node();

  private Node find(String prefix) {
    Node node = root;
    for ( char c : prefix.toCharArray()) {
      int i = c - 'a';
      if (node.children[i] == null)
        return null;
      node = node.children[i];
    }
    return node;
  }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);    public Trie() {
  
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */