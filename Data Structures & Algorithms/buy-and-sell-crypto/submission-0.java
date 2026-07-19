class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit =0;

        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {

            minPrice = Math.min(minPrice, price);

            int currentProfit = price - minPrice;

            maxProfit = Math.max(currentProfit, maxProfit);
        }

        return maxProfit;
        
    }
}
