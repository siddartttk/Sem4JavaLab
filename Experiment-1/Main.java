import java.util.Scanner;

// This class uses attributes to store data
class Calculator {
    double n1;
    double n2;
    double result;

    // Constructor assigns user input to attributes
    public Calculator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void add() { result = n1 + n2; }
    public void subtract() { result = n1 - n2; }
    public void multiply() { result = n1 * n2; }
    public void divide() { 
        if (n2 != 0) result = n1 / n2; 
        else System.out.println("Error: Cannot divide by zero.");
    }
    
    // 5. Mathematical Modulus
    public void calculateModulus() {
        if (n2 != 0) result = n1 % n2;
        else System.out.println("Error: Cannot find modulus of zero.");
    }

    public void showResult() {
        System.out.println("Result: " + result);
    }
}

public class JavaTestClass { // Make sure the file is named JavaTestClass.java
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Display the updated list
            System.out.println("--- Mathematical Operations ---");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            
            System.out.print("\nChoose an operation: ");
            int choice = sc.nextInt();

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            // Create object using attributes
            Calculator myCalc = new Calculator(num1, num2);

            switch (choice) {
                case 1 -> myCalc.add();
                case 2 -> myCalc.subtract();
                case 3 -> myCalc.multiply();
                case 4 -> myCalc.divide();
                case 5 -> myCalc.calculateModulus();
                default -> {
                    System.out.println("Invalid choice!");
                    return;
                }
            }
            myCalc.showResult();
        }
    }
}