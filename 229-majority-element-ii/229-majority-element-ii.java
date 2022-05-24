class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        int n=nums.length;
HashMap <Integer,Integer>hm=new HashMap<>();
     for(int i=0;i<nums.length;i++){
       
             hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
         
     }
     for(Map.Entry i : hm.entrySet())
        {
        Integer val=(int)i.getValue();
         Integer key=(int)i.getKey();
            if(val > ((nums.length) / 3))
                l.add(key);
        }
        return l;
    }
    }
