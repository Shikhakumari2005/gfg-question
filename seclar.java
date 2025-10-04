public class seclar {
        public int getSecondLargest(int[] arr) {
            // code here
            int n=arr.length;
            Arrays.sort(arr);
            int count=1;
            for(int i=n-2;i>=0;i++){
                if(arr[i]==arr[n-1]){
                    System.out.print(arr[i]);
                }
            }
            return -1;
        }
    }
}
