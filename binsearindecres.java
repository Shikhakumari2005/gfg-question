public class binsearindecres {
    public static  int search(int[] arr, int target) {
        int n=arr.length;
        int l=0;
        int H=n-1;
        int idx=-1;
        //fast accqurens;
        while(l<H){
            int mid=(l+H)/2;
            if(arr[mid]>target){
                H=mid+1;
            }
            else if(arr[mid]<target){
                l=mid-1;
            }
            else if(arr[mid]==target){
                idx =mid;
                H=mid-1;                          //this for first acquerence

            }
        }
        return(idx);
    }
    public static void main(String args[]){
        int arr[]={9,8,7,6,5,4,3,2,1};
        int target=8;
        int res=search(arr ,target);
        System.out.print(res);
    }
}
