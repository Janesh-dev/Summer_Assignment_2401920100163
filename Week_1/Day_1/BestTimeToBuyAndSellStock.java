public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        // Sample test case
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        int maxProfit = calculateMaxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }

    public static int calculateMaxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minBuyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // If we find a lower price, update our buy price
            if (prices[i] < minBuyPrice) {
                minBuyPrice = prices[i];
            }

            // Calculate what the profit would be if we sold today
            int currentProfit = prices[i] - minBuyPrice;

            // If this is the best profit so far, save it
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }
}