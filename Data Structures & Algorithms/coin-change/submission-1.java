class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] min_coin_dp = new int[amount+1];

        for(int i=1;i<amount+1;i++){
            min_coin_dp[i] = Integer.MAX_VALUE;
            for(int coin:coins){
                if(coin<=i && min_coin_dp[i-coin]!= Integer.MAX_VALUE){
                    min_coin_dp[i] = Math.min(min_coin_dp[i],1+min_coin_dp[i-coin]);

                }
            }
        }
        if(min_coin_dp[amount]== Integer.MAX_VALUE) return -1;
        return min_coin_dp[amount];

        
    }
}
