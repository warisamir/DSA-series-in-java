class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        ArrayList<Integer>ls=new ArrayList<Integer>();
      int l1=arr1.length-1,l2=arr2.length-1;
        int car=0;
        while(l1>=0 || l2>=0 || car!=0){
            int i1=l1>=0?arr1[l1--]:0;
            int i2=l2>=0?arr2[l2--]:0;
            int sum=i1+i2+car;
            int res=sum&1;
            car=-1*(sum>>1);
            ls.add(0,res);
        }
        int bgind=0;
        while(bgind<ls.size() && ls.get(bgind)==0)
            bgind++;
        if(bgind==ls.size())
            return new int[]{0};
        int arr[]=new int[ls.size()-bgind];
        for(int i=0;i<arr.length;i++){
            arr[i]=ls.get(i+bgind);
        }
        return arr;
    }
    
}