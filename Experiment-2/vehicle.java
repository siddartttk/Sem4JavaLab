public class vehicle {
    public String brandName;
    public String modelName;
    public String color;
    public double price;
    public String mfgCode;
    public float currentSpeed = 0;

    // 1. DEFAULT CONSTRUCTOR
    public vehicle() {
        this.brandName = "Generic";
        this.modelName = "Base Model";
        this.color = "White";
        this.price = 10000.0;
        this.mfgCode = "TEMP-000";
    }

    // 2. PARAMETERIZED CONSTRUCTOR
    public vehicle(String brand, String model, String col, double pr, String code) {
        this.brandName = brand;
        this.modelName = model;
        this.color = col;
        this.price = pr;
        this.mfgCode = code;
    }

    // 3. COPY CONSTRUCTOR
    public vehicle(vehicle other) {
        this.brandName = other.brandName;
        this.modelName = other.modelName;
        this.color = other.color;
        this.price = other.price;
        this.mfgCode = other.mfgCode;
    }

    // --- BEHAVIORS ---
    public void start() { System.out.println(brandName + " " + modelName + " is starting..."); }
    public void stop() { System.out.println("Engine stopped for " + modelName); }
    
    public void changeSpeed(float speedInput) {
        this.currentSpeed = (speedInput < 20) ? speedInput + 20 : speedInput - 20;
        System.out.println("New Speed: " + this.currentSpeed + " kmph");
    }

    public float tripmileage(float dist, float fuel) {
        return dist / fuel;
    }

    // --- MAIN METHOD: CREATING THE OBJECTS ---
    public static void main(String[] args) {
        
        // OBJECT 1: Using Default Constructor
        // No info provided, so it uses the "Generic" values.
        vehicle v1 = new vehicle();

        // OBJECT 2: Using Parameterized Constructor
        // We provide all specific details right here in one line.
        vehicle v2 = new vehicle("Honda", "Accord", "Blue", 250000.45, "XYZ1234");

        // OBJECT 3: Using Copy Constructor
        // We create a new object (v3) that is an exact clone of v2.
        vehicle v3 = new vehicle(v2);

        // TESTING THE OBJECTS
        System.out.println("--- Testing v1 (Default) ---");
        printVehicleDetails(v1);

        System.out.println("\n--- Testing v2 (Parameterized) ---");
        v2.start();
        v2.changeSpeed(15);
        printVehicleDetails(v2);

        System.out.println("\n--- Testing v3 (Copy of v2) ---");
        // Notice v3 has Honda Accord details because it copied v2!
        printVehicleDetails(v3);
    }

    public static void printVehicleDetails(vehicle v) {
        System.out.println("Details: " + v.brandName + " " + v.modelName + " | Color: " + v.color + " | Code: " + v.mfgCode);
    }
}
