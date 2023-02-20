
   class Solution {
    public int searchInsert(int[] nums, int t) {
       int low=0,hi=nums.length-1;
       return  bn(nums,low,hi,t);
    }
       private int bn(int []n,int l,int h,int t){
           int mid=(l+h)/2;
           if(t>n[n.length-1]) return n.length;
           if(mid==l ||mid==h)//////////////////////////////if(nums[mid] == target) return mid;
 		//else if(nums[mid] > target) //return bs(nums, low, mid, target);
 		//else return bs(nums, mid, high, target);
           {
             if(t>n[l])return h;
               else return l;
           } 
           if(n[mid]==t) return mid;
           else if(n[mid]>t) return bn(n,l,mid,t);
           else return bn(n,mid,h,t);
       }
   }
       