class Solution {
    public int change(int t, int[] coins) {
//         int[] dp=new int[t+1];
//         dp[0]=1;
//         for(int coin:coins)
            
//             for(int i=0;i<=t-coin;++i)
                
//                 dp[i+coin]+=dp[i];
        
//         return dp[t];
//     }
//
// // not using the ith coin, only using the first i-1 coins to make up amount j, then we have dp[i-1][j] ways.
// using the ith coin, since we can use unlimited same coin, we need to know how many way to make up amount j -    //coins[i]by using first i coins(including ith), which is dp[i][j-coins[i]]
// // Initialization: dp[i][0] = 1
// using extra space  
//         2d dp  
int dp[][]=new int[coins.length+1][t+1] ;
dp[0][0]=1;
for(int i=1;i<=coins.length;i++){
    dp[i][0]=1;
    for(int j=1;j<=t;j++){
        dp[i][j]=dp[i-1][j]+(j>=coins[i-1]?dp[i][j-coins[i-1]]:0);
    }
}
return dp[coins.length][t];
}}