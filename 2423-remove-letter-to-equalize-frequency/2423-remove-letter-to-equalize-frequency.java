class Solution {
    public boolean equalFrequency(String word) {
       int ar[]=new  int[26];
        for(char c:word.toCharArray()){
            ar[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(ar[i]==0) 
                continue;
                ar[i]--;
        if (res(ar))
            return true;
            ar[i]++;
        }
        return false;
    }
    public boolean res(int arr[]){
        HashSet<Integer>hm=new HashSet<>();
        for(int i=0;i<26;i++){
            if(arr[i]!=0)
            hm.add(arr[i]);
        }
        return hm.size()<2;
    }
    
}