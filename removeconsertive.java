import java.util.*;
public class removeconsertive {
    public static int[] remove(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for (int i = 0; i <n; i++) {
            if(st.size()==0) st.push(arr[i]);
            else if(arr[i]!=st.peek())  st.push(arr[i]);
            else if(arr[i]==st.peek()){
                if(i==n-1 || arr[i]!=arr[i+1]) st.pop();
            }           
        }
        int [] res=new int[st.size()];
        int m=res.length;
        for (int i =m-1; i>=0; i--) {
            res[i]=st.pop();
           // System.out.print(res[i] + "");
            
        }
        return res;

    }
    public static void main(String[] args){
        int[] arr={1,4,4,6,6,6,6,8,8,8,9,3,4 ,6,6};
        int res[]=remove(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + "");
            
        }

    }
}
