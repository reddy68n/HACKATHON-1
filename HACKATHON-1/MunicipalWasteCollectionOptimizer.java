import java.util.Scanner;
public class MunicipalWasteCollectionOptimizer {

    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vehicle Details");
        int vehicleNumber = 2345;
        double wasteCollectedinKg = 100.75;
        int collectionPoints = 12;
        char vehicleStatus = 'A';

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected (kg): " + wasteCollectedinKg);
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
        System.out.println();

        System.out.println("Waste Collection Status Check");
        System.out.print("Enter waste collected in kilograms: ");
        double wasteInput = scanner.nextDouble();

        if (wasteInput >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }
        System.out.println();

        System.out.println("Calculate Total Waste");
        System.out.print("Enter waste collected at Collection Point 1 (kg): ");
        double point1 = scanner.nextDouble();

        System.out.print("Enter waste collected at Collection Point 2 (kg): ");
        double point2 = scanner.nextDouble();

        double totalWaste = calculateTotalWaste(point1, point2);
        System.out.println("Total waste collected from both points: " + totalWaste + " kg");
        scanner.close();
    }
}