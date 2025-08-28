

public class missinfofarr {
    public static int Missing(int[] arr ,int n){
        int sum=n*(n+1)/2;
        int sumarr=0;                       //arithmatic sum of N number
        for (int i = 0; i < arr.length; i++) {
            sumarr +=arr[i];
        }
        System.out.println(sum - sumarr);
        return sum -sumarr;
    }
    public static void main(String arg[]){
        int arr[]={2, 3, 4, 5, 6, 1};
        int n=arr.length +1;
        Missing(arr ,arr.length+1);
    
    }
}
