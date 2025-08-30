import java.util.Arrays;
public class hindex {
    public static int HIndex(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int idx=0;

        //while(idx<n && arr[n-1-idx]>idx){              //This compares the same element arr[n - 1] (i.e., the last element) every time
        while(idx<n && arr[n-1-idx]>idx){             //Changes each loop    //This compares elements moving backward from the end of the array.
                idx++;
        }
        return idx;
    }
    public static void main(String[] args){
        int[] arr={6,0,2,4,2};
        System.out.println(HIndex(arr));
    }
}







// idx = 0 → arr[3] = 2 → 2 > 0 → ✅ → idx = 1

// idx = 1 → arr[2] = 3 → 3 > 1 → ✅ → idx = 2

// idx = 2 → arr[1] = 4 → 4 > 2 → ✅ → idx = 3

// idx = 3 → arr[0] = 5 → 5 > 3 → ✅ → idx = 4

// idx = 4 → loop ends 🔚 Returns: 4

