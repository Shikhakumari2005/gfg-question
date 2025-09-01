public class mergetwosortedarr {
    public static void MergeSortArr(int[] arr1 ,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;      
        int idx=m+n-1;
        int i=n-1;
        int j=m-1;
        while(i>=0 &&j>=0){
            if(arr1[i]<arr2[j]){
                arr1[idx]=arr2[j];
                idx--;
                i--;
                //j--;
            }else{
                arr1[idx--]=arr2[j--];
            }

        }
        while(j>=0){
            arr1[idx--]=arr2[j--];
        }

    } 
    public static void  main(String[] args){
        int[] arr1={1,2,3,0,0,0};
        int[] arr2={5,6,7};
        MergeSortArr(arr1, arr2);
        for(int value:arr1){
            System.out.print(value + " ");
        }
    }
}
