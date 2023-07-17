import java.util.Scanner;

class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
     public void endExecution() {
        System.out.println("Exiting the calculator...");
        System.exit(0);
    }
}

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        while(true){
            System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();
        
        System.out.println("Enter the operation (+, -, *, /): ");
        System.out.println("Enter Z to exit");
        String operation = scanner.next();
        Calculator calc = new Calculator(a, b);
            switch (operation) {
                case "+":
                    result = calc.add();
                    break;
                case "-":
                    result = calc.subtract();
                    break;
                case "*":
                    result = calc.multiply();
                    break;
                case "/":
                    result = calc.divide();
                    break;
                case "Z":calc.endExecution();
                    break;
                default:
                    System.out.println("Invalid operation.");
                    
                    break;
            }
             System.out.println("Result: " + result);
            
        }
      
    }
}
