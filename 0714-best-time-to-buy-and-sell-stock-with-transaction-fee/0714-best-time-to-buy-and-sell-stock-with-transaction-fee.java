
class Solution {
    public int maxProfit(int[] pr, int fee) {
        int obsp=-pr[0];
        int ossp=0;
        for(int i=1;i<pr.length;i++){
            int nssp=0,nbsp=0;
        if(ossp-pr[i]>obsp)
            nbsp=ossp-pr[i];
            else
            nbsp=obsp;
        if(obsp+pr[i]-fee>ossp)
            nssp=obsp+pr[i]-fee;
            else
                nssp=ossp;
            obsp=nbsp;
            ossp=nssp;
        }
        return ossp;
    }
}