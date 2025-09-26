import java.util.ArrayList;
import java.util.HashSet;

public  class intersection{
    public static void Inter(int a[] ,int b[]){
        // ArrayList<Integer>res=new ArrayList<>();      //create arraylist
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < b.length; j++) {
        //         if(a[i]==b[j]){
        //             res.add(a[i]);
        //             break;                             //avoid the duplictae
        //         }
        //     }  
        // }
        // System.out.println("Intersection: " + res);




//using nested amd hashset

        // HashSet<Integer> res=new HashSet<>();
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < b.length; j++) {
        //         if(a[i]==b[j] && !res.contains(a[i])){
        //             res.add(a[i]);
        //             break;                             //avoid the duplictae
        //         }
        //     }  
        // }
        // System.out.println("Intersection: " + res);




    

//using two hashset
        HashSet<Integer> res_set=new HashSet<>();      //Creates another HashSet named res_set to track which elements have already been added to the result. This helps avoid duplicates.
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();   //Creates an ArrayList named res to store the final intersection result in a list format.
    // Add all elements of array a to set
        for (int num : a) {
           set.add(num);
        }
    // Check for intersection
        for (int num : b) {
            if (set.contains(num) && !res_set.contains(num)) {
               res.add(num);
               res_set.add(num); // avoid duplicates
            }
        }
        System.out.println("Intersection: " + res);
    }
    public static void main(String[] args) {
        int a[]={2,5,3,7,1,9};
        int b[]={4,2,5,10,7,9,44};
        Inter(a, b);
    }  
}