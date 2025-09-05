import java.util.ArrayList;
public class SpiralMatrix {
    public ArrayList<Integer>spirallyTraverse(int[][] arr){
            ArrayList<Integer>matrix=new ArrayList<>();
            int m=arr.length;
            int n=arr[0].length;
            int srow=0;
            int scol=0;
            int erow=m-1;
            int ecol=n-1;
            while(srow<=erow && scol<=ecol){
                //Right
                for(int j=scol ;j<=ecol;j++){
                    matrix.add(arr[srow][j]);
                }
                srow++;
                if(srow>erow || scol>ecol){
                   break;
                }
                //down
                for(int i=srow ;i<=erow;i++){
                    matrix.add(arr[i][ecol]);
                }
                ecol--;
                if(srow>erow || scol>ecol){
                    break;
                 }
                //left
                for(int j=ecol+1 ;j>=scol;j--){
                    matrix.add(arr[erow][j]);
                }
                erow--;
                if(srow>erow || scol>ecol){
                    break;
                 }
                //up
                for(int i=erow-1 ;i>=srow+1;i--){
                    matrix.add(arr[i][scol]);
                }
                scol++;
                
            }
            return matrix;    
    }
        public static void main(String[] args) {
            int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10,11,12},
                {13,14,15,16}
            };
            SpiralMatrix sm = new SpiralMatrix();
            ArrayList<Integer> result = sm.spirallyTraverse(arr);
            System.out.println(result);
    }
}

            