public class rowmaxsum {
    public static  void main(String[] args){
        int arr[][]={{2,3,4} ,{5,6,7},{8,9,98}};
        int maxsum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum +=arr[i][j];
            }
            //maxsum=Math.max(maxsum,sum);
        }
        System.out.println(maxsum);
    }
}
