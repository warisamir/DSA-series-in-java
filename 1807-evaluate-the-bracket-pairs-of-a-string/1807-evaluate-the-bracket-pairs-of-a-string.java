/**
 * @param {string} s
 * @param {string[][]} knowledge
 * @return {string}
 */
var evaluate = function(s, kn) {
    let obj={};
    for(var i=0;i<kn.length;i++){
        obj[kn[i][0]]=kn[i][1]
    }
    const keyArray=Object.keys(obj);
    keyArray.forEach(keys=>{
        let regex=new RegExp(`\\(${keys}\\)`,"g");
        s=s.replace(regex,obj[keys])
    })
    if(s.indexOf('(')<0)
        {
            return s;
        }
    return s.replace(/\(.*?\)/g,"?");
};