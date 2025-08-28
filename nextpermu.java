import java.util.Arrays;
public class nextpermu {
    public static void NextPermutation(int arr[]){
        int n=arr.length;

        //find pivote index
        int pivote=-1;
        for(int i=n-2 ;i>=0 ;i--){
            if(arr[i]<arr[i+1]){
                pivote=i;
                break;
            }
        }
        //if the pivote doesnot exist then reverse the whole array !Q why

        if(pivote==0){
            reverse(arr ,0 ,n-1);
            return;
        }
        //find the elmt from the right that is greater than pivote
        for(int i=n-1 ;i>pivote;i--){
            if(arr[pivote]<arr[i]){
                // int temp=arr[i];
                // arr[i]=pivote;
                // pivote=arr[i];
                swap(arr ,i ,pivote);
                break;
            }
        }
        //reverse the elmt from pivovte+1to end
       // for(int i=pivote+1 ;i<=arr.length ;i++){
         reverse(arr ,pivote+1 ,n-1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        NextPermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + );
            
        }
    }
}

