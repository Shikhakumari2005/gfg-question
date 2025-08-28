public class maxprosub{
  static int Maxsub(int arr[]){
    //NAive Approach

  //   int maxpro=arr[0];
  //   for(int i=0 ;i<arr.length ;i++){
  //     int curr=1;
  //     for(int j=i ;j<arr.length; j++){
  //       curr *=arr[j];
  //       maxpro=Math.max(curr ,maxpro);
  //     }
  //   }
  //   return maxpro;
  // }










  //2  Approach
  //   int currmin=arr[0];
  //   int currmax=arr[0];
  //   int maxpod=arr[0];
  //   for (int i=0 ;i<arr.length ;i++){
  //      int temp=Math.max(arr[i] ,arr[i]*currmax , arr[i]*currmin);
  //      currmin=Math.min(arr[i] ,arr[i]*currmax , arr[i]*currmin);
  //      currmax=temp;
  //      maxpod=Math.max(maxpod ,currmax);
  //   }
  //   return maxpod;
  // }








  //3approach to treverseth loop from both side
    int currst=0;
    int currend=arr.length-1;
    int currmax=Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]==0){
            currst=0;
      }
      currst*=arr[i];
    }
    for (int j = arr.length-1; j>=0; j++) {
      if(arr[j]==0){
          currend=0;
      }
      currend *=arr[j];
    }
    return currmax=Math.max(currst ,currend);
  }
  public static void main (String args[]){
    int arr[]={-2 ,6 ,-3 ,-10 ,0,2};
    System.out.print(Maxsub(arr));

  }
}

