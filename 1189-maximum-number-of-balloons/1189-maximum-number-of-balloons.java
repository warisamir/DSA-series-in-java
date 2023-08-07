class Solution {
    public int maxNumberOfBalloons(String text) {
          HashMap<Character, Integer> s = new HashMap<>();
        for (char i : text.toCharArray()){
            s.put(i, s.getOrDefault(i, 0) + 1);
        }
        int ans = 0;
        if ((s.containsKey('b')) && (s.containsKey('a')) && 
            (s.containsKey('l')) && (s.containsKey('o')) && 
            (s.containsKey('n'))){
            int b = (s.get('b')).intValue();
            int a = (s.get('a')).intValue();
            int l = s.get('l').intValue()/2;
            int o = (s.get('o')).intValue()/2;
            int n = s.get('n').intValue();
            ans = Math.min(Math.min(a, b), Math.min(l, o));
            ans = Math.min(ans, n);
        }
        return ans;
    }
}