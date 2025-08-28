
public class stingtoint {
    static void myATOI(String str){
        int sign=1;
        int res=0;
        int idx=0;
        //ignore all leading space
        while(idx<str.length() && str.charAt(idx)== ' '){
            idx++;
        }
        //stor the sign
        if(idx<str.length() && (str.charAt(idx)=='-'  || str.charAt(idx)=='+')){
            if(str.charAt(idx)=='-'){
                sign=-1;
            }
            idx++;
        }
        //Processes digits only, stopping at non-digit characters
        while( idx<str.length() && str.charAt(idx)>='0' && str.charAt(idx)<='9'){
             int digit=str.charAt(idx) -'0';
            
             //handling overflow/underflow test case
            if(res >(Integer.MAX_VALUE -digit)/10){
                if(sign==1){
                    System.out.print("overflow ");
                    System.out.println(Integer.MAX_VALUE);
                }else{
                    System.out.print("underflow ");
                    System.out.println(Integer.MIN_VALUE);
                }
                return;
            }
            res= res * 10 + digit;
            idx++;
        }
        res = res *sign;
        System.out.println("convered intger;" + res);
    }
    public static void main(String[] args) {
        myATOI("9999999999");     // Overflow
        myATOI("-9999999999");    // Underflow
        myATOI("2147483647");     // Max value
        myATOI("-2876544567");    // Min value
        myATOI("12345");          // Normal case
        myATOI("955678 RAdheyShyam");
    }
}
