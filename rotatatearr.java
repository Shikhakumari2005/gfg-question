public class rotatatearr {
    public static void Rotatearr(int arr[] ,int i ,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String arg[]){
        int arr[]={2,4 ,1,6,5,7};
        int d=2;
        Rotatearr(arr ,0,arr.length-1);
        Rotatearr(arr ,0,d+1);
        Rotatearr(arr ,d, arr.length-1);
        for (int k = 0; k < arr.length; k++) {
           System.out.print(arr[k]);
        }
    }
}
