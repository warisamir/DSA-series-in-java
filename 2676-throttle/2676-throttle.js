/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var throttle = function(fn, t) {
   let tid;
    let lte = 0;
    return function(...args) {
        let today = Date.now();
        let elapsedTime = today - lte;
        
        if(elapsedTime > t)
        {
            fn.apply(this, args)
            lte = today;
        } 
        else {
            clearTimeout(tid);
            tid = setTimeout(() => {
                fn.apply(this, args);
                lte = Date.now();
            }, t - elapsedTime);
        }
    }
};

/**
 * const throttled = throttle(console.log, 100);
 * throttled("log"); // logged immediately.
 * throttled("log"); // logged at t=100ms.
 */