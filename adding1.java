public class adding1 {
    public static int[] Adding1(int[] arr){
           int n=arr.length;
            for(int i = n - 1; i >= 0; i--){
                if(arr[i] < 9){
                    arr[i]++;
                    return arr; // ✅ Stop once increment is done
                }
                arr[i] = 0; // Carry over
            }
            //If we reach here, all digits were 9
            int[] newArr = new int[n + 1];
            newArr[0] = 1;
            return newArr;
         }
        
    public static void main(String[] args){
        //int[] arr={1,8,9};                     // 1 9 0
        //int[] arr={1,9};                    //2 0 
       int[] arr={9,8,7,6,5};
        //int[] arr={9,1,7};                           //9 1 8 
        //int[] arr={9};  
        arr=Adding1(arr);                       //
        //Adding1(arr);                    //Without this line, you're printing the original array, not the modified one
        for(int value :arr){
            System.out.print(value +" ");
        }
    }
}
