class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int minP = prices[0];

        for (int sell : prices) {
            res = Math.max(res, (sell - minP));
            minP = Math.min(minP, sell);
        }
        return res;
    }
}
