// //brute approach
// import java.util.Arrays;

// public class rotatey90Arr {
//     public static int[][] rotate(int[][] arr) {
//         int row = arr.length;
//         int col = arr[0].length;
//         int[][] rotated = new int[col][row];

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 rotated[j][row - 1 - i] = arr[i][j];
//             }
//         }
//         return rotated;
//     }

//     public static void main(String[] args) {
//         int[][] arr = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9},
//             {10, 11, 12}
//         };

//         int[][] rotated = rotate(arr);

//         for (int[] row : rotated) {
//             System.out.println(Arrays.toString(row));
//         }
//     }
// }




//Reverse method and then transpose
import java.util.Arrays;

public class rotateby90arr {
    public static void Rotate(int[][] arr){
        int m=arr.length;
       // int n=arr[0].length;

        // reverse each row of the matrix
        for(int i=0; i<m;i++){
           
                int l=0; int r=m-1;        //why not m
                while(l<r){ 
                    int temp=arr[i][l];
                    arr[i][l]=arr[i][r];
                    arr[i][r]=temp;
                    l++;r--;
                }
        }
        System.out.print(arr);

        //transpose the matrix
        for(int i=0; i<m-1;i++){
            for(int j=i+1;j<m;j++){
                int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
            }
        }
        //return Rotate(arr);
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                
        };
    
        Rotate(arr);
    
        for (int[]  row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
