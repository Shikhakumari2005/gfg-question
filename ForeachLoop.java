public class ForeachLoop {
    public static void main(String[] args) {
        int[][] arr={{2,3,4} ,{5,6,7},{8,9,1}};
        for (int i = 0; i < arr.length; i++) {
           // for(int elm:arr){      //this give eror
            for(int elm:arr[i]){ 
                System.out.println(elm);
            }
            System.out.println("");
        }
    }
}
