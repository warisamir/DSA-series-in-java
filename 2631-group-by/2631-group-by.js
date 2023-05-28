/**
 * @param {Function} fn
 * @return {Array}
 */
Array.prototype.groupBy = function(fn) {
      return this.reduce((result, item) => {
    const key = fn(item);
    if (!(key in result)) {
      result[key] = [];
    }
    result[key].push(item);
    return result;
  }, {});
};
