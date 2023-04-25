/**
 * @param {any[]} arr
 * @param {number} depth
 * @return {any[]}
 */
var flat = function (arr, n) {
    if(n==0) return arr;
    let res=[];
     for(let i=0; i<arr.length; i++){
        
        // check if element is instance of array and depth is not equal to 0
        if(n>0 && Array.isArray(arr[i])){
            
            // recursively call the function for this array and push the flattened array to the answer array
            res.push(...flat(arr[i], n-1));
        }
        // else directy push the current array
        else{
            res.push(arr[i]);
        }
    }
    
    return res;
}