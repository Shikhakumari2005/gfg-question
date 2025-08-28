public class buyandsell {
    // public static int BuySell(int price[] ,int st ,int end){
    //     int res=0;
    //     for(int i=st ; i<end ;i++){
    //         for(int j=i+1 ;j<=end ;j++){
    //             if(price[j]>price[i]){
    //                 int curr=  price[j]-price[i] +BuySell(price ,st ,i-1) + BuySell(price ,j+1 ,end);
    //                 res=Math.max(res, curr);
    //             }
    //         }
    //     }
    //     return res;
    // }
    // public static void main(String args[]){
    //     int price[]={100,67,211 ,321 ,160, 654};
    //      int profit=BuySell(price ,0 ,price.length-1);
    //      System.out.print("Maximum Profit:" + profit);
    // }
//}



//approech 2
    public static int BuySell(int price[]){
        // int localmax=price[0];
        // int localmin=price[0];
        // int profit=0;
        // int i=0;
        // int n=price.length;
        // while(i <n-1){
        //     while (i<n-1 &&  price[i]<=price[i+1]) {
        //         i++;
        //     }
        //     localmax=price[i];
        //     while (i<n-1 &&  price[i]>=price[i+1]) {
        //         i++;
        //     }
        //     localmin=price[i];
        
        //     profit +=(localmax-localmin);
                
            










        //Apporach3
            int res=0;
            for(int i=0 ;i<price.length; i++){
                if(price[i]>price[i-1]){
                res=res +  (price[i] -price[i-1]);
                }
        }
        return res;
    }
    public static void main(String args[]){
        int price[]={100,67,211 ,321 ,160, 654};
         int profit=BuySell(price);
         System.out.print("Maximum Profit:" + profit);
    }
}
