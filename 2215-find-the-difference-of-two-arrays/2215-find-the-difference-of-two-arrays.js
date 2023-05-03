/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[][]}
 */
var findDifference = function(nums1, nums2) {
   let numsOfSet1 = new Set(nums1);
   let numsOfSet2 = new Set(nums2);
   let result = [[], []];

   for (let num of numsOfSet1) {
     if (!numsOfSet2.has(num)) {
       result[0].push(num);
     }
   }
   for (let num of numsOfSet2) {
     if (!numsOfSet1.has(num)) {
       result[1].push(num);
     }
   }

   return result;
};