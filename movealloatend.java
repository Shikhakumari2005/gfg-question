
import java.util.*;
public class movealloatend {
    public static void Move0(int arr[]){
        int n=arr.length;


        // 1st APPORACH
        // int temp[]= new int[n];                    //copy arr to tempory arr


        // //to keep track of the index in temp[]
        // int j=0;

        // //copy all non zero elmt in tempory arr
        // for(int i=0 ;i<n ;i++){
        //     if(arr[i]!=0){
        //        temp[j++] = arr[i];           
        //     }
        // }

        // //fill remaining postion in temp with 0
        // while(j<n){
        //     temp[j++]=0;

        // //copy all tepm elmt into original arr
        // for(int i=0 ;i<n ;i++){
        //     arr[i]=temp[i];
        // }
 
        // }










        //2APPORACH


        
        //Why: This variable tracks where the next non-zero element should be placed in the array.Goal: Begin placing non-zero numbers from index 0, then keep shifting right as you go.
      //  int count=0;


        // //Purpose: Traverses each element of the array.
        // for(int i=0; i<n ;i++){
        //     if(arr[i]!=0){

        //       //  Why: Move the non-zero element to the count-th position, then increment count.
        //         arr[count++]=arr[i];
             
        //     }
        // }
        // while(count<n){
        //     arr[count++]=0;
        // }
        









        //3rd APPORACH

    
    int count=0;
    for(int i=0 ;i<n ;i++){
        if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[count];           
            arr[count]=temp;
            count++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,0,8,0,9,0,0,10,11};
        Move0(arr);
        for(int num:arr){
          System.out.print(num);
        }
    }
    
}
