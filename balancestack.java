import java.util.*;
public class balancestack {
    public  static boolean isbalaned(String str){
        Stack<Character>st=new Stack<>();              //string into stack
         int n=str.length();
         for(int i=0;i<n;i++){                                       //i<=n it give error out of bond
            char ch=str.charAt(i);                    //convet string into character
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='('){
                    st.pop();
                }
            }
         }
         if(st.size()>0) return false;
         else return true;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();            //input str
        System.out.println(isbalaned(str));                 //Calls isbalaned and prints the result.

       
    }
}
