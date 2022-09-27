class Solution {
    class Pair{
        int ind;
        char pos;
        public Pair(int ind,char pos){
            this.ind=ind;
            this.pos=pos;
        }
    }
    public String pushDominoes(String s) {
       char []arr=s.toCharArray();
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='.'){
                q.add(new Pair(i,s.charAt(i)));
            }
        }
            while(!q.isEmpty()){
                Pair p=q.poll();
                int d=p.ind;
                char c=p.pos;
                if(c=='L' && d>0 && arr[d-1]=='.')
                {
                   q.add(new Pair(d-1,'L'));
                    arr[d-1]='L';
                }
                else if(c=='R'){
                    if(d+1<s.length() && arr[d+1]=='.'){
                        if(d+2<s.length() && arr[d+2]=='L')
                            q.remove();
                    else
                    {
                        q.add(new Pair(d+1,'R'));
                        arr[d+1]='R';
                    }
                    }
                }
            }
                   return String.valueOf(arr);
    }
}