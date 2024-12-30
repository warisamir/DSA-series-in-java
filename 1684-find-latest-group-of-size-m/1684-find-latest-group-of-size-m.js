/**
 * @param {number[]} arr
 * @param {number} m
 * @return {number}
 */
var findLatestStep = function(arr, m) {
     let size = arr.length;
    let sizes = Array(size + 2).fill(0);
    let count = Array(size + 2).fill(0);
    let res = -1;

    for (let i = 0; i < size; i++) {
        let pos = arr[i];
        let l = sizes[pos - 1];
        let r = sizes[pos + 1];
        let len = l + r + 1;

        sizes[pos] = sizes[pos - l] = sizes[pos + r] = len;
        count[l] -= 1;
        count[r] -= 1;
        count[len] += 1;
        if (count[m]) res = i + 1;
    }
    return res;
};