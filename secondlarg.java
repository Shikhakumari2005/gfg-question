public class secondlarg {
    public static int findsecondlar(int arr[]){
    //     //using sorting apporach1
         int n=arr.length;
    //     Arrays.sort(arr);                            //sort the arr
    //     for (int i = n-2; i >=0; i--) {             //start from second last as last elmt is largest elmt
    //                                                //if(arr[i]<secondlarg && arr[i]!=largest){
    //         if(arr[i]!=arr[n-1]){
    //            return arr[i];
          
    //         }
    //     }
    //     return -1;                                 //if no second lrgest elmt was found return-1

    // }
    // //using sorting apporach1






    //two pass search

    //  int largest=-1;
    //     int secondlar=-1;
    //     for (int i = 0; i <n; i++) {
    //         if(arr[i]>largest){
    //             largest=arr[i];
    //         }
    //     }
    //     for (int i = 0; i <n; i++){
    //         if(arr[i]>secondlar && arr[i]!=largest){
    //             secondlar=arr[i];
    //         }
    //     }
    //     return secondlar;
    // }





    //one pass search
        int largest=-1;
        int secondlar=-1;
        for (int i = 0; i <n; i++) {
            if(arr[i]>largest){
                secondlar=largest;
                largest=arr[i];

            }
            else if(arr[i]<largest && arr[i]>secondlar){
                 secondlar=arr[i];
            }
        }
        return secondlar;
    }


    public static void main(String arg[]){
        int arr[]={34,87,21,45,98};
        System.out.println(findsecondlar(arr));
        
    }

    
}
