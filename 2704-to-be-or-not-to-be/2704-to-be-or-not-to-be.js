/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
   function toBe(val2){
        if(val === val2){
            return true;
        }
        else
            throw new Error("Not Equal");
    }
    
   function notToBe(val2){
        if(val === val2)
            throw new Error("Equal");
        else
            return true;
    }
    return {toBe:toBe, notToBe:notToBe};
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */