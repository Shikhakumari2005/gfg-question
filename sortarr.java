import java.util.Arrays;
public class sortarr {
    public static void main(String[] args) {
        int rarr[] = {2,1,6,4,9,3,7};
        Arrays.sort(rarr);
        print(rarr);
    }
    public static void print(int  rarr[]){
        for (int i = 0; i < rarr.length; i++) {
            System.out.print(rarr[i] + " ");
        }
        System.out.println("");
    }
}
