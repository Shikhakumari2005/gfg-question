public class twosumarr {
    public static void main(String arg[]){
        int arr[] = { 3,4,6,7,8,9,1};
        int target=12;
        for(int i=0 ; i<arr.length ;i++){
            for(int j=1+i;j<arr.length ;j++){       //why not j=1
                if(arr[i] +arr[j]==target){
                    System.out.println("true");
                }
            }
        }
        return;
    }
}
