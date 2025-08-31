// public class peakelmt {
//     public static int PeakEmlemnt(int[] arr){
//         //linear search

//         //corner case
//         if(arr.length==1 && arr.length==2){
//             System.out.println("have no peak elmt");
//         }
//         int idx=-1;
//         for(int i=1; i<arr.length ;i++){
//             if(arr[i-1]<arr[i] && arr[i+1]<arr[i]){
//                  idx=i;
//                 System.out.println(arr[i]);
//             }
//         }
//         return idx;
//     }
//     public static void main(String[] args) {
//         int[] arr={2,4,5,3,6,7};
//         int pealval=PeakEmlemnt(arr);
//         System.out.println(pealval);
//     }
// }
class GfG {
    static int peakElement(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean left = true;
            boolean right = true;

            // Check for element to the left
            if (i > 0 && arr[i] <= arr[i - 1])
                left = false;

            // Check for element to the right
            if (i < n - 1 && arr[i] <= arr[i + 1])
                right = false;

            // If arr[i] is greater than its left as well as
            // its right element, return its index
            if (left && right) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        System.out.println(peakElement(arr));
    }
}