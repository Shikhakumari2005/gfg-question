import java.util.Arrays;

public class union {
    public static void Union(int a[] ,int b[]){
        for (int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]!=b[j]){
                    a.append(b[j]);
                }
            }
        }

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
