class Solution {
    int res[];
    class Pair{
        int idx;
        int val;
        Pair(int idx,int val){
            this.idx=idx;
            this.val=val;
        }
    }
    public List<Integer> countSmaller(int[] nums) {
      Pair[] pr=new Pair[nums.length];
        for(int i=0;i<nums.length;i++){
            pr[i]=new Pair(i,nums[i]);
        }
        res=new int[pr.length];  
        mergesort(pr,0,pr.length-1);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int val:res){
            ans.add(val);
        }
        return ans;
    }
    Pair[] mergesort(Pair []pr,int lo ,int hi){
          if(lo==hi){
            Pair ba[]=new Pair[1];
            ba[0]=new Pair(lo,pr[lo].val);
            return ba;
        }
        int mid=(lo+hi)/2;
        Pair fh[]=mergesort(pr,lo,mid);
        Pair sh[]=mergesort(pr,mid+1,hi);
        Pair sarr[]=merge(fh,sh);
        return sarr;
    }
    public Pair[] merge(Pair []fh,Pair []sh){
      
        Pair ret[]=new Pair[sh.length+fh.length];
        int i=0,j=0,k=0;
        while(i<fh.length && j<sh.length){
            if(fh[i].val>sh[j].val){
                ret[k]=fh[i];
            res[fh[i].idx] +=(sh.length-j);
                
                i++;
                k++;
            }
            else
            {
                ret[k]=sh[j];
                j++;
                k++;
            }
        }
            while(i<fh.length){
                  ret[k]=fh[i];
                i++;k++;
            }
            while(j<sh.length){
                ret[k]=sh[j];
                j++;k++;
            }
        
        return ret;
    }
}