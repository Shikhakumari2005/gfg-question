public class arra2 {
    public static void main(String[] args) {
        int[][] arr=new int[3][4];          //  3;-row ,4;-col
        System.out.println(arr.length);                       //no. of rows
        System.out.println(arr[0].length);                          //no.of col
        for(int i=0; i<3;i++){
            for(int j=0;j<4 ;j++){
               System.out.print(arr[i][j]);
            }
        System.out.println(" ");
        }
    
    
    }
}
