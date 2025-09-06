public class searchinsortrow {
    public static boolean Search(int[][] arr,int tar){
       // int m=arr.length;
       // int n=arr[0].length;
        int l=0;int h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            
            if(arr[mid]<tar){
                l=mid+1;
            }else if(arr[mid]>tar){
                h=mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
    public static boolean SOrtedRow(int[][] mat ,int tar){
        for (int i = 0; i < mat.length; i++) {
            if(Search(mat[i], tar)){
                return true;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            
        };
        int tar=5;
        if(SOrtedRow(mat ,tar)){
            System.out.println("true");
        }else{
            System.out.println("False");

        }
        
    }
}

// public class searchinsortrow {

//     // Corrected binary search for a sorted 1D array
//     public static boolean Search(int[] arr, int tar) {
//         int l = 0;
//         int h = arr.length - 1;

//         while (l <= h) {
//             int mid = l + (h - l) / 2;

//             if (arr[mid] == tar) {
//                 return true;
//             } else if (arr[mid] < tar) {
//                 l = mid + 1;
//             } else {
//                 h = mid - 1;
//             }
//         }
//         return false;
//     }

//     // Search each row
//     public static boolean SOrtedRow(int[][] mat, int tar) {
//         for (int i = 0; i < mat.length; i++) {
//             if (Search(mat[i], tar)) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int[][] mat = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9},
//         };
//         int tar = 5;

//         if (SOrtedRow(mat, tar)) {
//             System.out.println("true");
//         } else {
//             System.out.println("False");
//         }
//     }
// }
