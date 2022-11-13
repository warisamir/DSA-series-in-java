class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:deck){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int ct=0;
        int gcd=1;
        for(int k:hm.keySet()){
            if(ct==0)
                gcd=hm.get(k);
            else 
            {
                int num=hm.get(k);
                gcd=getGcd(num,gcd);
            }
            ct++;
        }
        return gcd>=2;
    }
    public int getGcd(int n1,int n2){
        while(n1%n2!=0){
            int rm=n1%n2;
            n1=n2;
            n2=rm;
        }
        return n2;
    }
}