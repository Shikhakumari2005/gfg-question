import java.util.*;

class Solution {

    public List<String> braceExpansionII(String expression) {

        Set<String> result = solve(expression, 0, expression.length() - 1);

        return new ArrayList<>(result);
    }

    // Solve expression from l to r
    private Set<String> solve(String s, int l, int r) {

        Set<String> result = new TreeSet<>();

        Set<String> current = new TreeSet<>();
        current.add("");

        int i = l;

        while (i <= r) {

            char c = s.charAt(i);

            // If we find {
            if (c == '{') {

                int count = 1;
                int j = i + 1;

                while (count > 0) {

                    if (s.charAt(j) == '{') {
                        count++;
                    } 
                    else if (s.charAt(j) == '}') {
                        count--;
                    }

                    j++;
                }

                // j-1 is the closing }
                Set<String> inside = solve(s, i + 1, j - 2);

                current = multiply(current, inside);

                i = j;
            }

            // If we find a normal letter
            else if (c >= 'a' && c <= 'z') {

                Set<String> letter = new TreeSet<>();
                letter.add(String.valueOf(c));

                current = multiply(current, letter);

                i++;
            }

            // If we find comma
            else if (c == ',') {

                result.addAll(current);

                current = new TreeSet<>();
                current.add("");

                i++;
            }
        }

        result.addAll(current);

        return result;
    }

    // Concatenate two sets
    private Set<String> multiply(Set<String> a, Set<String> b) {

        Set<String> result = new TreeSet<>();

        for (String x : a) {
            for (String y : b) {
                result.add(x + y);
            }
        }

        return result;
    }
}
