import java.util.Scanner;

// Class definition
class Calculator {
    // Attributes (Fields)
    double n1;
    double n2;
    double result;

    // Constructor to initialize attributes
    public Calculator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // Methods for each operation
    public void add() { result = n1 + n2; }
    public void subtract() { result = n1 - n2; }
    public void multiply() { result = n1 * n2; }
    public void divide() { 
        if (n2 != 0) result = n1 / n2; 
        else System.out.println("Error: Division by zero.");
    }
    
    // Mathematical Modulus Method
    public void calculateModulus() {
        if (n2 != 0) result = n1 % n2;
        else System.out.println("Error: Modulus by zero.");
    }

    public void showResult() {
        System.out.println("The result is: " + result);
    }
}

public class JavaTestClass {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Step 1: Menu Display
            System.out.println("--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus"); // Added to the list
            
            System.out.print("Choose an operator (1-5): ");
            int operator = sc.nextInt();

            // Step 2: Input numbers
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            // Step 3: Create Object
            Calculator myCalc = new Calculator(num1, num2);

            // Step 4: Perform operation based on choice
            switch (operator) {
                case 1 -> myCalc.add();
                case 2 -> myCalc.subtract();
                case 3 -> myCalc.multiply();
                case 4 -> myCalc.divide();
                case 5 -> myCalc.calculateModulus();
                default -> {
                    System.out.println("Invalid operator selection.");
                    return;
                }
            }

            // Step 5: Output
            myCalc.showResult();
        }
    }
}
