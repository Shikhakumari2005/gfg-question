public class reverarr{ 
    public static void reversearr(int arr[]){
        int n=arr.length;


        //int temp = 0; is wrong because you need an array, not a single integer.
        // int[] temp=new int[n];

//this give same arr becoz we reverse arry 2 time so it give original so to reverse make n/2
        // for(int i=0; i<n ;i++){    

        // for(int i=0; i<n/2 ;i++){                                      //copy emt from ori to temp arr
        //     temp[i]=arr[n-1-i];
        // }
        // for(int i=0; i<n ;i++){
        //     arr[i]=temp[i];
        // }







        //2nd APPORAch

        //2pointer technique
        // int L=arr[0];
        // int R=arr.length-1;
        // while(L<R){
        //     //swap the elmt at L and R
        //     int temp=arr[L];
        //     arr[L]=arr[R];
        //     arr[R]=temp;
        //     L++;
        //     R--;
        //     }
    
    }
    public static void main(String arg[]){
        int arr[]={2 ,4,3,5,6,8,1};
        reversearr(arr);
        for(int num:arr){
        System.out.print(num + " ");
        }
    }  
}