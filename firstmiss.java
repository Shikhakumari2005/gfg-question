public class firstmiss {
    public static int firstMissing(int[] arr){
        // for(int i=0; i<arr.length;i++){
        //     for(int j=0;j<dub.length;j++){
        //          if(arr[i]!=dub[j]){
        //             System.out.print(j);
        //             break;
        //          }else{
        //             System.out.print("every thing is found");
        //          }

        //     }










        //2second aproach


        int missing=1;
        for(int i=0;i<arr.length;i++){
            while(arr[i]>0){
                if(arr[i]==missing){
                    missing +=1;
                    break;
                }else if(arr[i]>missing){
                    break;
                }
                else{
                    System.out.println(missing);
                    break;
                }
            }
        }
        return missing;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};
       
        System.out.print(firstMissing(arr));
        // for(int value :arr){
        //     System.out.print(value);
        //}
    }
}
