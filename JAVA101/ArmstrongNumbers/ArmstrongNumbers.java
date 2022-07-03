import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        
        int number, digitValue, digitPow;
        int numberOfDigits = 0, result = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number : ");
        number = input.nextInt();

        int tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            numberOfDigits++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            digitValue = tempNumber % 10;
            digitPow = 1;
            for (int i = 1; i <= numberOfDigits; i++) {
                digitPow *= digitValue;
            }
            result += digitPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println("The number " + number + " is an Armstrong number.");
        }else{
            System.out.println("The number " + number + " is not an Armstrong number.");

        }

        input.close();
    }
}
