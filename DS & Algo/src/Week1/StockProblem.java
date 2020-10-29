package Week1;

public class StockProblem {

    public int maxProfit(int[] prices) {
        if(prices.length>0){
            int min = prices[0];
            int profit = 0;
            int i = 0;
            int max = prices[0];

            while(i<prices.length){
                if(prices[i]>max){
                    //new max greater than old max
                    max = prices[i];
                }
                if(prices[i]<min){
                    min = prices[i];
                    // No selling without buying so max should be after min
                    max = prices[i];
                }
                if(max-min>profit){
                    //maximum profit
                    profit = max-min;

                }
                i++;
            }

            return profit;
        }

        else{
            return 0;
        }
    }
    public static void main(String [] args){

    }
}