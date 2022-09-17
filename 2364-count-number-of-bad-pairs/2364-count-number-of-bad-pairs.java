class Solution {
    public long countBadPairs(int[] nums) {
  int n=nums.length;
//   for(int i=0;i<n;i++){
//       nums[i]-=i;
      
//   }
//         Arrays.sort(nums);
//        long ct=0,gpair=0;
//         int pre=nums[0];
//         for(int i=1;i<n;i++){
//             if(pre==nums[i])
//             {   ct++;
//             gpair+=ct;}
//             else
//             {ct=0;
//             pre=nums[i];}
//         }
//         return (long)n*(n-1)/2-gpair;
//     }
        long ct=(long)n*(n-1)/2;
        HashMap<Integer,Long>hm=new HashMap<Integer,Long>();
        for(int i=0;i<n;i++){
       int k=nums[i]-i;
            if(hm.containsKey(k))
                ct-=hm.get(k);
            hm.put(k,hm.getOrDefault(k,0L)+1);
        } 
        return ct;
    }
        }