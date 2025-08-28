
import java.util.Arrays;

public class shallowcopydeep {
    public static void main(String[] args) {
        int arr[]= {2 ,3 ,4 ,5};
        int[] x= arr;
        x[0] =100;
        System.out.println(arr[0]);             // this give addresh why



        //deep copy
        // int[] y =Arrays.copyOf(arr, arr.length);           //deep copy
        // y[0]=200;
        // System.out.println(arr[0]);
        // System.out.println(y[0]);


                 //or 
        int brr= new int[arr.length];
        for(int i=0 ;i<arr.length ;i++){
            brr[i]=arr[i]
        }

    }
}
