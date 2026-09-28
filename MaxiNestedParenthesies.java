import java.util.*;

public class Main {

    public static int maxDepth(String s) {

        int depth = 0;
        int maxDepth = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            }

            else if (c == ')') {
                depth--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Maximum Depth = " + maxDepth(s));
    }
}
