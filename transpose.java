public class transpose {
    public static void main(String[] args){
        int[][] arr={{2,3,4},{5,6,7},{8,9,10} ,{11,21,13}};
        for(int j=0;j<arr[0].length;j++){
            for(int i=0; i<arr.length;i++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
    
}