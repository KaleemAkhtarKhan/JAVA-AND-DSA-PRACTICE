public class array12 {

    public static int buyandselStockes(int prices[]){
        int maxprofit = 0;
        int buyprice = Integer.MAX_VALUE;
        for (int i=0; i<prices.length; i++){
            if(buyprice<prices[i]){
               int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }






    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int profit = buyandselStockes(prices);
        System.out.println("the max profit can be acchived is :" +profit);

    }
}
