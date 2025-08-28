import java.util.ArrayList;
import java.util.List;
        public class pascaltriangle {
            public static void main(String[] args) {
                int n=5;
            
            //public List<List<Integer>> generate(int n) {
                List<List<Integer>> a = new ArrayList<>();
        
                for (int i = 0; i < n; i++) {
                    List<Integer> list = new ArrayList<>();
                    for (int j = 0; j <= i; j++) {
                        list.add(1); // Initialize with 1s
                    }
                    a.add(list);
                }
        
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= i; j++) {
                        if (j != 0 && j != i) {
                            int value = a.get(i - 1).get(j) + a.get(i - 1).get(j - 1);
                            a.get(i).set(j, value);
                        }
                    }
                }
                //return a;
                for (List<Integer> row : a) {
                    for (int num : row) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
            }

        }
        
