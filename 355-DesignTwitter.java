public class Twitter {
    private class Post{
        public int tweetId;
        public int sequence;
        public Post next;
        public Post(int id, int seq, Post nxt){
            tweetId = id;
            sequence = seq;
            next = nxt;
        }
    }
    private class Com implements Comparator<Post>{
        public int compare(Post p1, Post p2){
            return -(p1.sequence - p2.sequence);
        }
    }
    private int seq;
    private Map<Integer, Set<Integer>> fls;
    private Map<Integer, Post> posts;

  public Twitter() {
        fls = new HashMap<Integer, Set<Integer>>();
        posts = new HashMap<Integer, Post>();
        seq = 0;
    }
    
    public void postTweet(int userId, int tweetId) {
        if(!posts.containsKey(userId)){
            posts.put(userId, null);
        }
        if(!fls.containsKey(userId)){
            fls.put(userId, new HashSet<Integer>());
        }
        posts.put(userId, new Post(tweetId, seq++, posts.get(userId)));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> list = new ArrayList<Integer>();
        if(!fls.containsKey(userId)) return list;
        PriorityQueue<Post> set = new PriorityQueue<Post>(new Com());
        if(posts.containsKey(userId)){
            set.add(posts.get(userId));
        }
        for(int id: fls.get(userId)){
            if(posts.containsKey(id)){
                set.add(posts.get(id));
            }
        }
        for(int i = 0; i < 10 && !set.isEmpty(); i++){
            Post tmp = set.poll();
            list.add(tmp.tweetId);
            if(tmp.next != null) set.add(tmp.next);
        }
        return list;
    }
    
    public void follow(int followerId, int followeeId) {
        if(followerId == followeeId) return;
        if(!fls.containsKey(followerId)) fls.put(followerId, new HashSet<Integer>());
        fls.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(followerId == followeeId) return;
        if(!fls.containsKey(followerId)) return;
        fls.get(followerId).remove(followeeId);
    }
}
