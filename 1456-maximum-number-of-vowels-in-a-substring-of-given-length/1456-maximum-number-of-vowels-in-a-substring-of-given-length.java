class Solution {
    public int maxVowels(String s, int k) {
       int ans=0;
        int n=s.length();
        int max=0;
        for(int i=0;i<k;i++){
            ans+=check(s.charAt(i));
        }
        max=ans;
        for(int i=1;i<=n-k;i++)
        {
            ans=ans-check(s.charAt(i-1))+check(s.charAt(i+k-1));
            max=Math.max(ans,max);
        }
        return max;  
    }
    public int check(char ch){
        if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
            return 1;
        return 0;
    }
}