class Solution {
      public int thirdMax(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
          for(int i=0;i<nums.length;i++)
              hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
          PriorityQueue<Integer>pq=new PriorityQueue<>();
          for(int i:hm.keySet()){
              pq.add(i);
              if(pq.size()>3)
                  pq.poll();
          }
              if(pq.size()==3)
              {
                 return pq.peek(); 
              }
              else {
                  int res=0;
                  while(pq.size()!=0)
                  {
                      res=pq.poll();
                  }
                  return res;
          }
    }
        
    }      
