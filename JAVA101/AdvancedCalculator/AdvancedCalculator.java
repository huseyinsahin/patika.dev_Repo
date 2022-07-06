import java.util.Scanner;

public class AdvancedCalculator {

    static void addition() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + "th number :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result += number;
        }
        
        System.out.println("Addition Result : " + result);

    }

    static void subtraction() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + "th number :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Subtraction Result : " + result);

    }

    static void multiplication() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = input.nextInt();
        int number, result = 1;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + "th number :");
            number = input.nextInt();

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Multiplication Result : " + result);

    }

    static void division() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + "th number :");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter the divisor as 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Division Result : " + result);

    }

    static void exponentiation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base value : ");
        int base = input.nextInt();
        System.out.print("Enter exponent value : ");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Exponentiation Result : " + result);

    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number :");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Factorial Result : " + result);

    }

    static void modeRetrieval() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to be received in the mode :");
        int receivedMode = input.nextInt();
        System.out.print("Enter the number of modes :");
        int numberOfModes = input.nextInt();

        int result = receivedMode % numberOfModes;
        System.out.println("Mode Retrieval Result : " + result);

    }

    static void rectangularAreaAndPerimeter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the long edge :");
        int longEdge = input.nextInt();
        System.out.print("Enter the short edge :");
        int shortEdge = input.nextInt();

        int area, perimeter;
        area = longEdge * shortEdge;
        perimeter = 2 * (longEdge + shortEdge);
        
        System.out.println("Area of rectangular: " + area);
        System.out.println("Perimeter of rectangular: " + perimeter);

    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponentiation Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Mode Retrieval\n"
                + "8- Rectangular Area and Perimeter Calculation\n"
                + "0- EXIT\n";

        do {
            System.out.print(menu);
            System.out.print("Please make your choice : ");
            select = input.nextInt();
            
            switch (select) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exponentiation();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modeRetrieval();
                    break;
                case 8:
                    rectangularAreaAndPerimeter();
                    break;
                default:
                    System.out.println("You entered an incorrect value, try again.");
            }
            System.out.println("=================================");
        } while (select != 0);

        input.close();

    }
}
