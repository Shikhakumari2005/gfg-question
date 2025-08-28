
import java.util.ArrayList;

public class Arraylist2D {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(23); a.add(12); a.add(56);
        ArrayList<Integer>b=new ArrayList<>();
        b.add(43); b.add(12); b.add(56);
        ArrayList<Integer>c=new ArrayList<>();
        c.add(93); c.add(12); c.add(56);
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(new ArrayList<>());                      //add new arr list it wont show but give space
        arr.get(arr.size()-1).add(10);
        arr.get(arr.size()-1).add(20);
       // System.out.println(arr);                    //[[23, 12, 56], [23, 12, 56], [23, 12, 56]]
   

       //anotherway
    //    for(int i=0;i<arr.size();i++){
    //         for(int j=0;j<arr.get(i).size();j++){
    //             System.out.print(arr.get(i).get(j)+" ");
    //         }
    //         System.out.println(""); 
    //    }
        


    //another way
    for(ArrayList<Integer> list:arr){
        for(int elm :list){
            System.out.print(elm +"");
        }
        System.out.println("");
    }
    }
}
