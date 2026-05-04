import java.util.Scanner;

public class DiameterCalculator {

    // Method to calculate diameter from radius
    public static double diameterFromRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        return 2 * radius;
    }

    // Method to calculate diameter from area
    public static double diameterFromArea(double area) {
        if (area < 0) {
            throw new IllegalArgumentException("Area cannot be negative.");
        }
        return 2 * Math.sqrt(area / Math.PI);
    }

    // Method to calculate diameter from two points (x1, y1) and (x2, y2)
    public static double diameterFromPoints(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Choose method to calculate diameter:");
            System.out.println("1. From radius");
            System.out.println("2. From area");
            System.out.println("3. From two points on circumference");
            System.out.print("Enter choice (1-3): ");
            int choice = sc.nextInt();

            double diameter = 0;

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    diameter = diameterFromRadius(radius);
                    break;

                case 2:
                    System.out.print("Enter area: ");
                    double area = sc.nextDouble();
                    diameter = diameterFromArea(area);
                    break;

                case 3:
                    System.out.print("Enter x1 y1: ");
                    double x1 = sc.nextDouble();
                    double y1 = sc.nextDouble();
                    System.out.print("Enter x2 y2: ");
                    double x2 = sc.nextDouble();
                    double y2 = sc.nextDouble();
                    diameter = diameterFromPoints(x1, y1, x2, y2);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    sc.close();
                    return;
            }

            System.out.printf("Diameter: %.4f%n", diameter);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
