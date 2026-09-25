class Solution {
     public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int r = i + 1;
            while (r <= prices.length - 1) {
                if (prices[r] - prices[i] > max) {
                    max = prices[r] - prices[i];
                }
                r++;
            }
        }
        return Math.max(max, 0);
    }
}
