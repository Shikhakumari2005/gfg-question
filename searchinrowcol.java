public class searchinrowcol {

    //Naive
    // public static boolean Searchmatrix(int[][] arr,int x){
    //     for(int i=0;i<arr.length;i++){
    //         for (int j = 0; j < arr[0].length; j++) {
    //             if(arr[i][j]==x){
    //               return true;
    //             }
    //         }
    //     }
    //     return false;
    // }



    //binary search
    public static boolean Searchmatrix(int[][] arr ,int tar){
        int m=arr.length;
        int n=arr[0].length;
        int i=0;
        int j=n-1;
        while(j>=0 && i<m){
            if(arr[i][j]==tar){
                return true;
            }else if(arr[i][j]>tar){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int tar=2;
        if(Searchmatrix(arr, tar)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
