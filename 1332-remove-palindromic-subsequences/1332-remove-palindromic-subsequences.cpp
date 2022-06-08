class Solution {
public:
    int removePalindromeSub(string s) {
        int h=s.size()-1,l=0;
        // int flag=1,c=0;
        while(l<h){
            if(s[l]!=s[h]){
                return 2;
            }
            l++;h--;
        }
        return 1;
    }
};