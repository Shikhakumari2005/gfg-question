public class bubblesosrtarr {
    public static void SortbyBubb(int arr[]){
        int n=arr.length;
        for(int i=0; i<n-1 ;i++){
            int swaps=0;
            for(int j=0 ;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){          //this for increasing order   for decreasing order change sign
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            if(swaps==0) break;         //this is for condidtion if array is already sorted              
        }
       // SortbyBubb(arr);                         his leads to infinite recursion and eventually a StackOverflowError.
    }

    public static void main(String[] args) {
        int arr[]={2,5,3,4,6,8,-2 ,0};
        SortbyBubb(arr);  
        for(int res:arr){
            System.out.print(res);
        }

    }
}
