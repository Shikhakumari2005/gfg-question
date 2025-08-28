public class maxsubarray {
    //kadanes algorthum
    static int Maxsub(int arr[]){
    //   int curr=0;
    //   int maxsum=Integer.MIN_VALUE;
    //   for(int i=0 ;i <arr.length ;i++){
    //     curr +=arr[i];        //sum 
    //     maxsum=Math.max(curr ,maxsum);
        
    //     //corrner case we write it htis place becacuse  so that we cn get atleast 1 maxsum  othwise we get -ve  it become 0 as res
    //     if(curr<0){
    //         curr=0;
    //     }
    //   }
    //   return maxsum;













    //brute for apporach
        int res=0;
        for(int i=0; i<arr.length ;i++){
            int curr=0;
            for(int j=i; j<arr.length ;j++){
                curr +=arr[j];
                res=Math.max(res ,curr);
        
            }
        }
        return res;

    }

    public static void main (String args[]){
        int arr[]={3 ,4,-9,5,9 ,-2 ,8,6};
        System.out.print(Maxsub(arr));

    }
}
