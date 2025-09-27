import java.util.ArrayList;

public class union {
    public static void Union(int a[] ,int b[]){
        ArrayList<Integer> List = new ArrayList<>();

        // Add all elements from array a
        for (int value : a) {
            if (!List.contains(value)) {
                List.add(value);
            }
        }

        // Add elements from array b if not already present
        for (int value : b) {
            if (!List.contains(value)) {
                List.add(value);
            }
        }

        // Print the union
        System.out.println("Union: " + List);
    }









        //using hashset
    //     HashSet<Integer> set=new HashSet<>();
    //     // Add all elements of array a to set
    //     for (int num : a) {
    //         set.add(num);
    //     }
    //     // Add all elements of array a to set
    //     for (int num : b) {
    //         set.add(num);
    //     }
    //     System.out.print(set);

    // }
    public static void main(String arg[]){
        int a[]={1,4,2,5};
        int b[]={3,2,4,6,7,9};
        Union(a,b);

    }
}
