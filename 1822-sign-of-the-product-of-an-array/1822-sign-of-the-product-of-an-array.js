/**
 * @param {number[]} nums
 * @return {number}
 */
var arraySign = function(nums) {
        return nums.reduce((acc,curr)=>{
            if(curr==0)
            acc=0;
            else
                acc*=curr>0?1:-1;
            return acc;
        },1);
};