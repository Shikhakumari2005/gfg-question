
import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> ans = new ArrayList<>();

        int i = 0;

        while (i < words.length) {

            // Find how many words can fit in this line
            int j = i;
            int lineLength = 0;

            while (j < words.length &&
                   lineLength + words[j].length() + (j - i) <= maxWidth) {

                lineLength += words[j].length();
                j++;
            }

            int numberOfWords = j - i;
            int spaces = maxWidth - lineLength;

            StringBuilder line = new StringBuilder();

            // Last line OR line contains only one word
            if (j == words.length || numberOfWords == 1) {

                for (int k = i; k < j; k++) {
                    line.append(words[k]);

                    if (k < j - 1) {
                        line.append(" ");
                    }
                }

                // Add remaining spaces at the end
                while (line.length() < maxWidth) {
                    line.append(" ");
                }

            } 
            else {

                // Normal justified line
                int gaps = numberOfWords - 1;

                int spacesPerGap = spaces / gaps;
                int extraSpaces = spaces % gaps;

                for (int k = i; k < j; k++) {

                    line.append(words[k]);

                    if (k < j - 1) {

                        // Every gap gets spacesPerGap
                        for (int s = 0; s < spacesPerGap; s++) {
                            line.append(" ");
                        }

                        // First extraSpaces gaps get one additional space
                        if (extraSpaces > 0) {
                            line.append(" ");
                            extraSpaces--;
                        }
                    }
                }
            }

            ans.add(line.toString());

            // Move to next line
            i = j;
        }

        return ans;
    }
}
