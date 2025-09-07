import java.util.Arrays;
public class zerosrowcol {
    public static void ZeroRowCol(int[][] arr){
        boolean[] zerorow =new boolean[arr[0].length];
        boolean[] zerocol =new boolean[arr.length];

        //identify rows and col that contain zeros
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                if(arr[i][j]==0){
                    zerorow[i]=true;
                    zerocol[j]=true;
                }
            }
        }

        //set entire  row to zero
        for(int i=0;i<arr.length;i++){
            if(zerorow[i]){
                Arrays.fill(arr[i],0);
            }
        }

        //set entire col to zero
        for(int j=0;j<arr[0].length;j++){
            if(zerocol[j]){
                for(int i=0;i<arr.length;i++){
                    arr[i][j]=0;
                }

            }
        }
    }

    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};


        System.out.println("Original Matrix:");
        printMatrix(arr);

        ZeroRowCol(arr);

        System.out.println("\nMatrix After ZeroRowCol:");
        printMatrix(arr);
        

        // ZeroRowCol(arr);
        // for(int val :arr){
        //     System.out.print(Arrays.toString(val));
        
    }
}
