public class binarysearch {
    public static  int search(int[] arr, int target) {
        int n=arr.length;
        int l=0;
        int H=n-1;
        int idx=-1;
        //fast accqurens;
        while(l<H){
            int mid=(l+H)/2;
            if(arr[mid]>target){
                H=mid-1;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else if(arr[mid]==target){
                idx =mid;
                H=mid-1;                          //this for first acquerence

            }
        }
        return(idx);
        
   

        //last accqerence
        
        l=0;
        H=n-1;
        idx=-1;
        while(l<H){
            int mid=(l+H)/2;
            if(arr[mid]>target){
                H=mid-1;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else if(arr[mid]==target){
                idx= mid;
                l=mid+1;
            }
        }
        
        return idx;

    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,67,67,67,67,67,67,89,100};
        int target=67;
        int index = search(arr, target);
        System.out.println("Target found at index: " + index);      

    }
}

