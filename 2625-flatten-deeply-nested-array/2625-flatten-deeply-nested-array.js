/**
 * @param {any[]} arr
 * @param {number} depth
 * @return {any[]}
 */
var flat = function (arr, n) {
    if(n==0) return arr;
    let res=[];
    for(let k of arr){
        if(Array.isArray(k))
            res.push(...flat(k,n-1))
        else
            res.push(k);
    }
    return res;
}