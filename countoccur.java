public class countoccur {
    //public static int CountOcc(int arr[] ,int t){


                     //LINERAR SEARCH
    //     int count=0;
    //     for(int i=0; i<arr.length ;i++){
    //         if(arr[i]==t){
    //             count++;
    //         }
    //     }
    //     System.out.print(count);
    //     return count;
    // }



                           //BINARY SEARCH
 




//First OCccurence
    public static int FirstOcc(int arr[] ,int t){
        int n=arr.length;
        int l=0 ;
        int h=n-1;
        int res=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==t){
                res=mid;
                h=mid-1;                        // Search left half for earlier occurrence
            }
            else if(arr[mid]>t){
                 h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        //System.out.println(res);
        return res;
    }

//last OCccurence
    public static int LastOcc(int arr[] ,int t){
        int n=arr.length-1;
        int l=0 ;
        int h=n-1;
        int res1=-1;
       // int mid=l+(h-l)/2;                  //reason :- outside the while loop. This means mid never updates as l and h change.
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==t){
                res1=mid;                              // Search right half for later occurrence
                l=mid+1;
            }
            else if(arr[mid]>t){
                 h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res1;
        //System.out.println(res1-res);
    }  
    public static void main(String args[]){
        int arr[]={2,2,3,3,3,3,3,4,5,67};
        int t=3;
        int first=FirstOcc(arr,t);
        int last=LastOcc(arr,t);
        int count = last - first + 1;
        System.out.println(first);
        System.out.println(last);
        System.out.println(count);

    }
}
