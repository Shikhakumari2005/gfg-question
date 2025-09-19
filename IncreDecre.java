import java.util.Scanner;
class IncreDecre {
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Print(n);
    }
    public static void Print(int n){
        if(n==0) return  ;           //base code;
        System.out.print(n);                                                          
        Print(n-1);                    //recursion
       // System.out.print(n);
        //for print 1 only once then
        if(n!=1) System.out.print(n);
    }
}
               //ouput method

//System.out.print(5 + " ") → prints 5

// Then Print(4) is called.

// prints 4

// calls Print(3)

// prints 3

// calls Print(2)

// prints 2

// calls Print(1)

// prints 1
        
 
