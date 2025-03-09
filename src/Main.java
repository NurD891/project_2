import java.util.*;

public class Main {
    private static final List<String> history = new ArrayList<>();

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double sqrtCalc(double number) {
        if (number < 0) throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
        return Math.sqrt(number);
    }

    public static double absolute(double number) {
        return Math.abs(number);
    }

    public static double roundCalc(double number) {
        return Math.round(number);
    }

    public static void addToHistory(String entry) {
        history.add(entry);
    }

    public static void showHistory() {
        System.out.println("Calculation History:");
        for (String entry : history) {
            System.out.println(entry);
        }
    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an arithmetic expression (or type 'history' to view history, 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the Calculator!");
                break;
            }

            if (input.equalsIgnoreCase("history")) {
                showHistory();
                continue;
            }

            try {
                String[] tokens = input.split(" ");
                double result = 0.0;
                if (tokens.length == 3) {
                    double num1 = Double.parseDouble(tokens[0]);
                    char op = tokens[1].charAt(0);
                    double num2 = Double.parseDouble(tokens[2]);

                    switch (op) {
                        case '+': result = num1 + num2; break;
                        case '-': result = num1 - num2; break;
                        case '*': result = num1 * num2; break;
                        case '/':
                            if (num2 == 0) throw new ArithmeticException("Cannot divide by zero.");
                            result = num1 / num2;
                            break;
                        case '%':
                            if (num2 == 0) throw new ArithmeticException("Cannot divide by zero.");
                            result = num1 % num2;
                            break;
                        case '^':
                            result = power(num1, num2);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid operator.");
                    }
                } else if (tokens.length == 2) {
                    String func = tokens[0];
                    double num = Double.parseDouble(tokens[1]);

                    switch (func) {
                        case "sqrt": result = sqrtCalc(num); break;
                        case "abs": result = absolute(num); break;
                        case "round": result = roundCalc(num); break;
                        default: throw new IllegalArgumentException("Invalid function.");
                    }
                } else {
                    throw new IllegalArgumentException("Invalid expression.");
                }

                System.out.println("Result: " + result);
                addToHistory(input + " = " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");
        calculator();
    }
}
