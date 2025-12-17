public class Calculate{
    public static void main(String[] args){

    //Create a integer variable name 'costPrice' and assign value 129
    int costPrice = 129;
    
    //Create a integer variable name 'sellingPrice' and assign value 191
    int sellingPrice = 191;
    
    //Create a integer variable name 'profit' and use formula sellingPrice - costPrice
    int profit = sellingPrice - costPrice ;
    
    //Create a integer variable name 'profitPercentage' and use formula profit/costPrice *100
    int profitPercentage = (profit/costPrice )* 100;
    
    System.out.print("The Cost Price is INR " + costPrice + "and Selling Price is INR " +    sellingPrice + "The Profit is INR " + profit + "and the Profit Percentage is" +   profitPercentage );
    }
}