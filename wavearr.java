public class wavearr{
    public static void WaveArr(int arr[]){
        for(int i=0 ;i<arr.length ;i +=2){

            if(i==arr.length-1){    //indexout of bound if u donot want to write any line more so u can writ for(i=0 to arr.length-1)
                break;
            }
            int temp =arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,7,8};
        WaveArr(arr);
        for(int res :arr){
            System.out.print(res);
        }
    }
}