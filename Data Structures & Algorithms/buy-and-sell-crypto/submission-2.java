class Solution {
    public int maxProfit(int[] prices) {
        int minP = prices[0], res = 0;

        for (int n : prices) {
            res = Math.max(res, n - minP);
            minP = Math.min(minP, n);
        }
        return res;
    }
}
