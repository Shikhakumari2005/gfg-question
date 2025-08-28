public class rotatearr {
    //public static int rotateArr(int arr[] ,int d){
    //     reverse(arr ,)
    
    public  static  void reversearr(int arr[] ,int i ,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] ={ 2,4,6,9,7,8};
        int n=arr.length;
        int i=0;
        int j=n-1;
        int d=2;
       // reversearr(arr ,0 ,d);              which includes d + 1 elements.
       reversearr(arr ,0 ,d-1);  
       reversearr(arr ,d ,n-1);
       reversearr(arr ,0 ,n-1);
        for(int k=0;k<arr.length ;k++){
           System.out.print(arr[k] + " ");
        }
    }
}



//Rule of Thumb
//Use i++ and j-- inside the loop when you're progressively moving pointers during a repeated operation (like swapping).

//Use them outside the loop only when you're setting up initial values or preparing for the loop.
// int n=arr.length;


        //concept is 1)reverse upto d;
        //2)reverse d upto n-1;
        //3)reverse whole 