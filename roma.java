public class roma {

    public static String toRoman(int num) {
        StringBuilder result = new StringBuilder();

        // Values and their Roman numeral symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40,
                        10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL",
                            "X", "IX", "V", "IV", "I"};

        // Brute force subtraction loop
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test examples
        int[] testNumbers = {2, 12, 27, 944, 2023};
        for (int n : testNumbers) {
            System.out.println(n + " → " + toRoman(n));
        }
    }
}
