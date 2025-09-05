import java.util.Arrays;

public class rotateby90arr {
    public static int[][] Rotate(int[][] arr){
        int m=arr.length;
        int n=arr[0].length;
        int[][] rotated = new int[n][m];
       // ArrayList<Integer>matrix=new ArrayList<>();
        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
                // int temp=arr[i][j];
                // arr[i][j]=matrix[i][j];
                // matrix[i][j]
                rotated[j][m-1-i]=arr[i][j];
            }
        }
        return rotated;
    }
    public static void main(String[] args) {
        
        int[][] arr={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] rotated=Rotate(arr);
        for(int[] value:rotated){
            System.out.print(Arrays.toString(value));
        }
        
    }
}

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
