public class BestTimeToBuyStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int leng = prices.length;

        for(int k=0;k<leng - 1;k++){

            if(prices[k + 1] > prices[k]) {
                profit += prices[k+1] - prices[k];
            }
        }

        return profit;

    }
}
