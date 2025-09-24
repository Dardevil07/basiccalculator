
    import java.util.Scanner;

    public class Simplecalculator {

        // Addition
        public static double add(double a, double b) {
            return a + b;
        }

        // Subtraction
        public static double subtract(double a, double b) {
            return a - b;
        }

        // Multiplication
        public static double multiply(double a, double b) {
            return a * b;
        }

        // Division
        public static double divide(double a, double b) {
            if (b == 0) {
                System.out.println("Cannot divide by zero!");
                return 0;
            }
            return a / b;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean keepRunning = true;

            System.out.println("=== Welcome to Basic Calculator ===");

            while (keepRunning) {
                // Get first number
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                // Get operator
                System.out.print("Enter operator (+, -, *, /): ");
                char op = sc.next().charAt(0);

                // Get second number
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                double result;

                // Perform calculation
                switch (op) {
                    case '+':
                        result = add(num1, num2);
                        break;
                    case '-':
                        result = subtract(num1, num2);
                        break;
                    case '*':
                        result = multiply(num1, num2);
                        break;
                    case '/':
                        result = divide(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        continue; // skip printing result
                }

                System.out.println("Result: " + result);

                // Ask user if they want to continue
                System.out.print("Do you want to perform another calculation? (y/n): ");
                char choice = sc.next().charAt(0);
                if (choice == 'n' || choice == 'N') {
                    keepRunning = false;
                    System.out.println("Thank you for using the calculator!");
                }
                System.out.println(); // blank line for readability
            }

            sc.close();
        }
    }

