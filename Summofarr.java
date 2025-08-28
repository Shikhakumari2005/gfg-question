
public class Summofarr{
    public static void main(String args[]){

        int arr[]= {2 ,3,4,5,7,6};

//sum of arr

        // int sum=0;                      //iniyonalize
        // for(int i=0 ;i<=arr.length ;i++){ 
        //     sum +=arr[i];            //add  one by one
        // }
        //System.out.println(sum);


//max/min of arr
        //int max= arr[0];
        // int min=Integer.MAX_VALUE;
        // for(int i=0 ;i<=arr.length-1 ;i++){ 
        //    if(arr[i]>max){
        //     max=arr[i];
        //    }         
        //    if(arr[i]<min){
        //     max=arr[i];
        //    }
           
        // }
        // System.out.println(max);
        // System.out.println(min);



//Product of arr
        int pro =1;
        for(int i=0 ;i<arr.length ;i++){
            pro *=arr[i];
        }
        System.out.print(pro);
    }
}