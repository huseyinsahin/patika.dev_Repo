import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        int firstNumber = 0, lastNumber = 1, nextNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Fibonacci Element Number : ");
        int elementNumber = input.nextInt();

        for (int i = 0; i < elementNumber; i++) {
            System.out.print(firstNumber + " ");

            nextNumber = firstNumber + lastNumber;
            firstNumber = lastNumber;
            lastNumber = nextNumber;

        }
        
        input.close();

    }
}
