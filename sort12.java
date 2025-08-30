import java.util.Arrays;
public class sort12 {
    public static void sort012(int[] arr){
        //first way sorting
        //Arrays.sort(arr);






        //2  counting sort approach 
        // int count0=0;
        // int count1=0;
        // int count2=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         count0++;
        //     }
        //     else if(arr[i]==1){
        //         count1++;
        //     }else{
        //         count2++;
        //     }
        // }
        // //You don’t need to track separate positions for even and odd—just one pointer that moves forward.by using idx
        // int idx =0;  
        // for(int i=0; i<count0;i++){
        //     arr[idx]=0;
        //     idx++;
        // }
        // for(int i=0; i<count1;i++){
        //     arr[idx]=1;
        //     idx++;
        //     //After this loop: arr = {0, 0, 0, 0, 1, 1, 1, ?, ?}
        //     //idx = 7
        // }
        // for(int i=0; i<count2;i++){
        //     arr[idx]=2;
        //     idx++;
        // }





        //3  dutch natinal flag approach
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={0,1,0,1,2,0,2,0,1};
        sort012(arr);
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
