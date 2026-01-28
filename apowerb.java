public class apowerb {
    public static int power(int a,int b){
        return a*power(a,b-1);
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter base;")
      int a=sc.nextInt();
      System.out.print("enter power");
      int b=sc.nextInt();
      System.out.println(a + "raised to pwer" +b+"is" +power(a,b))
    }
}