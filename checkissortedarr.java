public class checkissortedarr {

    public static boolean Checkarr(int arr[]) {
        for(int i=0 ;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
              return false;
            }
        }
        return true;
        //System.out.println("sorted");
        
    }
    public static void main(String args[]){
        int arr[]={2,3,5,4,6};
        boolean res=Checkarr(arr);
        System.out.println(res);
    }
}
