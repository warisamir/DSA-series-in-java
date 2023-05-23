/**
 * @param {Array} arr
 * @return {Matrix}
 */

const flatten = (arr, prefix = []) => Object.entries(arr)
  .reduce((r, [key, value]) => (typeof value !== 'object' || value === null)
    ? { ...r, [[...prefix, key].join('.')]: value }
    : { ...r, ...flatten(value, [...prefix, key]) }, {})

var jsonToMatrix = function(arr) {
  arr = arr.map(i => flatten(i))
  const keys = Object.keys(arr.reduce((r, i) => ({ ...r, ...i }), {})).sort()
  
  return arr.reduce((r, i) => [ ...r, keys.map(key => (key in i) ? i[key] : '')], [ keys ])  
};