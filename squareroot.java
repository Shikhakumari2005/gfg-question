//public class squareroot {
    //public static boolean SquareRoot(int[] arr){
    //     int n=arr.length;
    //     for(int i=0;i<=n ;i++){
    //         if(i*i >n){
    //             System.out.print("yes it is square root");
    //         }
    //     }
    //     System.out.println(n + " is not a perfect square.");
    //     return false;
    // }
    // public static void main(String args[]){
    //    int[] arr={4};
    //   // int res=SquareRoot(arr);
    //    for(int res:arr){
    //     SquareRoot(res);



public class squareroot {
    public static boolean SquareRoot(int num) {
        int root=-1;
        for (int i = 1; i * i <= num; i++) {
            if (i * i > num) {
                System.out.println(num + " is a perfect square.");
                root =i;
                return true;
            }
        }
        System.out.println(num + " is not a perfect square.");
        return false;
    }
    
    public static void main(String args[]) {
        int[] arr = {6};
        for (int res : arr) {
            SquareRoot(res);
        }
    }
}
    

