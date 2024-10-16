public class BestTimeToBuyAndSellStock {
    
        public int maxProfit(int[] prices) {
    
            //BRUTE FORCE O(N^2)
    
            // int max = Integer.MIN_VALUE;
            // int profit = 0;
            // for(int i = 0;i<prices.length;i++){
            //     for(int j=i;j<prices.length;j++){
            //         if(prices[j]>prices[i])
            //         {
            //             profit = prices[j]-prices[i];
            //         }
            //         max = Math.max(profit,max);
            //     }
            // }
            // return max;
    
    
            //OPTIMALL SOLUTION 
    
            int max = Integer.MIN_VALUE;
            int min = prices[0];
            for(int i = 0 ;i<prices.length;i++){
                if(prices[i]>=min){
                    max = Math.max(prices[i]-min,max);
                }else{
                    min = prices[i];
                }
            }
    
            return max;
        }
        public static void main(String[] args) {
            BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();
            
            int[] prices = {7, 1, 5, 3, 6, 4};  // Example stock prices
            
            int maxProfit = stock.maxProfit(prices);
            
            System.out.println("The maximum profit is: " + maxProfit);
        }
}
