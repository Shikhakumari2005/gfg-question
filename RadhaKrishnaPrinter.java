public class RadhaKrishnaPrinter {
    public static void main(String[] args) {
        int count = 0;
        int lineNumber = 1;

        while (count < 108) {
            String lineNumStr = String.valueOf(lineNumber);

            // Check if line number starts or ends with '2'
            if (lineNumStr.startsWith("2") || lineNumStr.endsWith("2")) {
                System.out.println(lineNumber + ": Radha Krishna");
                count++;
            }

            lineNumber++;
        }
    }
}
