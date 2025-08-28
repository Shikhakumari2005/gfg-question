public class countvowels {
    //public static void COuntVol(String str){
    public  static void main(String args[]){

        String str="radheyshayam";
        int count=0;
        for(int i=0; i<str.length();i++){
            System.out.println(str.charAt(i));         //sout string
            char ch=str.charAt(i);
            if(ch=='a' || ch=='i' || ch=='o' ||ch=='u'||ch=='e'){
                count++;
            }
        }
        System.out.println(count);
    }
}
