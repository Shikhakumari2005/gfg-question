public class buysell1limit {
     //explore all posible way of pair then find the max
     static int MaxProfit(int price[]){
        int res=0;
        for(int i=0 ; i<price.length ;i++){
            for(int j=i+1 ;j<price.length ;j++){
                res=Math.max(res ,price[j] -price[i]);
            }
        }
        return res;
     }
    public static void main(String args[]){
        int price[]={100,67,211 ,321 ,160, 654};
        int profit=MaxProfit(price);
        System.out.print("Maximum Profit:" + profit);
    }
}
