class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                maxp=Math.max(maxp,prices[j]-prices[i]);
            }
        }
        return maxp;
        
    }
}
