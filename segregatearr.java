public class segregatearr {
     //public static void Segregate01(int arr[]){
    //     int countzero=0;
    //     int countone=0;

    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i]==0){
    //             countzero++;
    //         }else{
    //             countone++;
    //         }
    //     }
    //     for(int j=0 ;j<countzero ;j++){
    //         System.out.println(arr[j]=0);
    //     }
    //     for(int j=countzero ;j<arr.length;j++){
    //         System.out.println(arr[j]=1); 
            
    //     }
    // }







    //APPROACh2 2 pointer
    public static void Segregate01(int arr[]){
        //int mid=(st+end)/2;
        int st=0;
        int end=arr.length-1;
        while(st<end){
            if(arr[st]==0) st++;
             elseif(arr[end]==0) end--;
             elseif(arr[st]==1 && arr[end]==0){
                arr[st]=0;
                arr[end]=1;
                st++;
                end--;
             }
        }
    }
    public static void main(String args[]){
       int arr[]={1,1,0,0,1,0,1,0,0,1};
       // int res=Segregate01(arr);    //this give error bcoz as segregate function is void but u let it as int so
       Segregate01(arr);
       for( int res :  arr){ 
            System.out.print(res + " ");
        }
    }
}
