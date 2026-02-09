public class MainForVehical {
    public static void main(String[] args) {
        // 1. Create v1 using Parameterized Constructor
        vehicle v1 = new vehicle("Honda", "Accord", "Blue", 250000.45, "XYZ1234");
        
        // 2. Create v2 using Parameterized Constructor
        vehicle v2 = new vehicle("Toyota", "Fortuner", "Pink", 400000.05, "hdsk2443");

        // 3. Create v3 (a copy of v1)
        vehicle v3 = new vehicle(v1);

        // Putting v1 to work
        v1.start();
        v1.drive();
        v1.changeSpeed(15); // Should result in 35
        System.out.println("Trip Mileage: " + v1.tripmileage(500, 25));
        v1.stop();

        printVehicleDetails(v1);
        
        System.out.println("\n--- Checking the Copy (v3) ---");
        printVehicleDetails(v3);
}
