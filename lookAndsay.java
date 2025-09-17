public class lookAndsay {
    public String LookSay(int n){
        //base code
        if(n==1) return "1";

        //recursion
        String s=LookSay(n-1) ;     
        String ans="";
        int i=0;
        int j=0;

        //if you used j <= s.length(), then s.charAt(6) would crash your program.
        
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int freq =j-i;
                ans +=freq;
                ans +=s.charAt(i);
                i=j;
            }
        }
        int freq =j-i;
        ans +=freq;
        ans +=s.charAt(i);
        return ans;
    }
    public static void main(String[] args) {
        int n = 4;
        lookAndsay obj = new lookAndsay(); // create object
        String result = obj.LookSay(n);    // call method
        System.out.println(result);        // print result
    }
}
