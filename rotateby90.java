
//by new variable

public class rotateby90 {
    public static  void Rotate90(int arr[][]){
     
        for (int i = 1; i < arr.length; i++) {                    //this say u only transpose the half matrix  nut sir give the corrtect answer
            for (int j = i+1; j <arr.length ; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{2,3,50},{5,6,7},{12,1,14}};
        
        
        for(int a[]:arr){
            for(int emt:a){
                System.out.print(emt + " ");
            }
            System.out.println( " ");
        }
        Rotate90(arr);
    }
}
