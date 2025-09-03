// public class majorityelmt {
//     public static void MajorELmt(int arr[]){
//         int n=arr.length;
//         for(int i=0 ;i<n;i++){
//             int count=0;
//             int num=arr[i];

        
//             count++;
//             if(count==n/3){
//                 System.out.println(arr[i] + " ");
//             }
             

//         }
//     } 
// }
public class DigitCounterPerNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 23, 104, 7890};

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;  // Reset count for each number
            int num = numbers[i];

            while (num != 0) {
                count++;
                num /= 10;  // Remove last digit
            }

            System.out.println("Digits in " + numbers[i] + ": " + count);
        }
    }
}
