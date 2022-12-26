class Solution {
    public int maxProfit(int[] pr) {
       int obsp=-pr[0];
        int ossp=0;
        int ocsp=0;
        for(int i=1;i<pr.length;i++){
            int nbsp=Math.max(obsp,ocsp-pr[i]);
            int nssp=Math.max(obsp+pr[i],ossp);
            int ncsp=Math.max(ocsp,ossp);
            obsp=nbsp;
            ossp=nssp;
            ocsp=ncsp;
        }
        return ossp;
    }
}