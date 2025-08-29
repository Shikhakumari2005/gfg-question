public class nonrepeting1 {
    public static void FirstNonRepeting(String str){
        int fre[]=new int[256];        //creat freq arr for all ASCII char


        //This correctly counts the frequency of each character using its ASCII value as the index.
        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);         //get each elmt
            fre[ch]++;                  //increase count  at ASCII index
        }



        for(int i=0; i<str.length();i++){
            char cha=str.charAt(i);
            if(fre[cha]==1){
                System.out.println( "" +cha );
                return;
            }
        }
        
    }









    //another way nestes loo
    // public static void FirstNonRepeting(String str){
    //     for(int i=0;i<str.length();i++){
    //         boolean isunique=true;
    //         for(int j=0;j<str.length();j++){
    //             if(i!=j && str.charAt(i)==str.charAt(j)){
    //                 isunique=false;
    //                 break;
    //             }
    //         }
    //         if (isunique) {
    //             System.out.println("First non-repeating character: " + str.charAt(i));
    //             return;
    //         }
    //     }
    // }
    public static void main(String[] args){
        String str="radheykrishna";
        FirstNonRepeting(str);
    } 
}
