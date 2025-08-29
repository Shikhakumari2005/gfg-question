import java.util.Arrays;
public class stranagram {

//     //Defines a method CompareToStr that takes two strings as input.
//     public static void CompareToStr(String str1 ,String str2){


//         // Step 1: Convert to lowercase
//         str1 = str1.toLowerCase();
//         str2 = str2.toLowerCase();


//         // Step 1: Check if lengths are equal
//         if (str1.length() != str2.length()) {
//             System.out.println("Not Anagram");
//             return;
//         }


//         //Converts both strings into character arrays so they can be sorted.
//         char[] char1=str1.toCharArray();
//         char[] char2=str2.toCharArray();
//         Arrays.sort(char1);
//         Arrays.sort(char2);

        
        
//         for(int i=0;i<char1.length;i++){
//             if(char1[i]!=char2[i]){
//                 System.out.println(" not Anagram");
//             }    
//         }
//         // If all characters matched
//         System.out.println("Anagram");
//     }



    public static boolean CompareToStr(String str1 ,String str2){
        if(str1.length()!=str2.length()){
           return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int[] fre=new int[256];
        for (int i = 0; i < str1.length(); i++) {
           fre[str1.charAt(i)]++;            // Increment for str1
           fre[str2.charAt(i)]--;             // Decrement for str2
        }
        for(int num:fre){
            if(num!=0){
               System.out.print("not anagram");
               return false;
            }
        }
        System.out.print(" anagram");
        return true;   
    }
    public static void main(String[] args){
        String str1="RAdhey";
        String str2="dheray";
        CompareToStr(str1 ,str2);

        
    }
}
  

//Why It Works Without a Separate Subtract Function
//You're not calling a function like subtract(str1, str2)—but you're still subtracting implicitly by doing freq[c]--.

//This is in-place subtraction using the same array. No need for a separate function because the logic is embedded directly in the loop.

