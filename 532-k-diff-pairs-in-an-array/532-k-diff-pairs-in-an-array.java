class Solution {
    public int findPairs(int[] nums, int k) {
//           HashMap<Integer,Integer> hm=new  HashMap<>();
//      int p=0,q=1;
//         int count=0;
//         int len=nums.length;
//         while(p<len && q<len){
//          int diff=Math.abs(nums[p]-nums[q]);
//             if(diff==k){
//                 int x,y;
//                 if(nums[p]>nums[q])
//                 {
//                     x=nums[p];
//                     y=nums[q];
//                 }
//                 else
//                 {     x=nums[q];
//                 y=nums[p];
//             }
//                 hm.put(x,y);
//         }
//             if(q==len-1){
//             p++;
//             q=p+1;
//             }
//             else q++;
//         }
//         return hm.size();
//     }
// }
    
       HashMap<Integer,Integer> hm=new HashMap<>();
        int l=nums.length;
        int par=0;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
                hm.put(nums[i],1);
        }
        for(Map.Entry m:hm.entrySet()){
            int key=(int)m.getKey();
            int val=(int)m.getValue();
            int fk=k+key;
      
            if(k==0 && val>1)
             par++;
            if(k!=0 && hm.containsKey(fk))
                par++;
        }
return par;
        }
    }
        
        
        
        
        
        
        
        
        
        
        
      