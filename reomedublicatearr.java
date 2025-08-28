public class reomedublicatearr {
    public static void RemoveDublicate(int arr[]){
        int n=arr.length;
        // for(int i=0 ;i<n ;i++){
        //     for(int j=i+1 ;j<n ;j++){
        //         if(arr[i]==arr[j]){
        //             System.out.print(arr[i]);
        //             break;
        //         }
        //     }
        // }





        //Approach 2
        boolean[] freq= new boolean[n];
        for (int i=0 ;i<n ;i++) {
            int elmt=arr[i];               //elmt = arr[i] stores the current value.

                                            //
                                            freq[elmt] checks if this value has already been seen.

            if(freq[elmt]==true){
                System.out.println("imposter is present");
            }else{
                freq[elmt]=true;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={2 ,3,4 ,5 ,6 ,7,4};
        RemoveDublicate(arr);          //so to print arr we have to cal the function
    }
}
