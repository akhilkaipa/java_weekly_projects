import java.util.Scanner;

public class NumberSystemConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("A - Convert to decimal");
            System.out.println("B - Convert from decimal");
            System.out.println("C - Addition");
            System.out.println("D - Subtraction");
            System.out.println("E - Multiplication");
            System.out.println("F - Division");
            System.out.println("W - Exit");

            choice = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();

            switch (choice) {
                case 'A':
                    convertToDecimal(scanner);
                    break;
                case 'B':
                    convertFromDecimal(scanner);
                    break;
                case 'C':
                    performOperation(scanner, '+');
                    break;
                case 'D':
                    performOperation(scanner, '-');
                    break;
                case 'E':
                    performOperation(scanner, '*');
                    break;
                case 'F':
                    performOperation(scanner, '/');
                    break;
                case 'W':
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 'W');

        scanner.close();
    }

    public static void convertToDecimal(Scanner scanner) {
        System.out.print("Enter number: ");
        String number = scanner.next();
        System.out.print("Enter base (2, 3, 4, 5, 6, 8, 9, 10, 16): ");
        int base = scanner.nextInt();

        try {
            int decimal = Integer.parseInt(number, base);
            System.out.println("Decimal equivalent: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number for the given base.");
        }
    }

    public static void convertFromDecimal(Scanner scanner) {
        System.out.print("Enter decimal number: ");
        int decimal = scanner.nextInt();
        System.out.print("Enter base (2, 3, 4, 5, 6, 8, 9, 10, 16): ");
        int base = scanner.nextInt();

        String converted = Integer.toString(decimal, base);
        System.out.println("Converted number: " + converted.toUpperCase());
    }

    public static void performOperation(Scanner scanner, char operation) {
        System.out.print("Enter first number: ");
        String num1 = scanner.next();
        System.out.print("Enter base: ");
        int base1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        String num2 = scanner.next();
        System.out.print("Enter base: ");
        int base2 = scanner.nextInt();
        System.out.print("Enter result base: ");
        int resultBase = scanner.nextInt();

        try {
            int decimal1 = Integer.parseInt(num1, base1);
            int decimal2 = Integer.parseInt(num2, base2);
            int result = 0;

            switch (operation) {
                case '+':
                    result = decimal1 + decimal2;
                    break;
                case '-':
                    result = decimal1 - decimal2;
                    break;
                case '*':
                    result = decimal1 * decimal2;
                    break;
                case '/':
                    if (decimal2 == 0) {
                        System.out.println("Cannot divide by zero.");
                        return;
                    }
                    result = decimal1 / decimal2;
                    break;
            }

            String convertedResult = Integer.toString(result, resultBase).toUpperCase();
            System.out.println("Result in base " + resultBase + ": " + convertedResult);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number for the given base.");
        }
    }
}