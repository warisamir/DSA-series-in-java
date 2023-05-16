/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function(fn, t) {
	return async function(...args) {
        const t1=fn(...args);
        const t2=new Promise((req,res)=>{
            setTimeout(()=>{
                res('Time Limit Exceeded')
            },t)
        });
        return Promise.race([t1,t2]);
    }
};

 

/**
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */