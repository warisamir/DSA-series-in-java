class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length())
            return false;

        HashMap<Character,Integer> map1= new HashMap<>();
        for(int i=0; i<s1.length(); i++)
        {
            char ch= s1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        HashMap<Character,Integer> map2= new HashMap<>();
        for(int i=0; i<s1.length(); i++)
        {
            char ch= s2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        if(map1.equals(map2))
            return true;

        int i=0;
        for(int j=s1.length(); j<s2.length(); j++)
        {
            char charAtLeft= s2.charAt(i);
            char charAtRight= s2.charAt(j);
            map2.put(charAtLeft,map2.get(charAtLeft)-1);

            if(map2.get(charAtLeft)==0)
                map2.remove(charAtLeft);

            map2.put(charAtRight,map2.getOrDefault(charAtRight,0)+1);
            i++;

            if(map1.equals(map2))
                return true;
        }

        return false;
    }
}