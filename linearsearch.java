import java.util.Scanner;
public class linearsearch {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int target= sc.nextInt();
        int arr[] =new int[6];
//so we first let
        boolean flage= false;          //this mean initionally target is not in arr

        for(int i=0 ;i<=arr.length-1 ;i++){
            arr[i]= sc.nextInt();
            if(arr[i]==target){
            //     System.out.println("emt is found");
            // }else{
            //     System.out.println("emt is not found");
            // }




            //soo to solve the problem

            flage=true;     //means target arr mai hey
            break;
            }
        }
        if(flage==true) System.out.println("emt is found");
        else System.out.println("emt is not found");
    }
}
