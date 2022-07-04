import java.util.Scanner;

public class InvertedTriangleWithStars {
    public static void main(String[] args) {

        int numberOfDigits;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number of digits : ");
        numberOfDigits = input.nextInt();

        for (int i = numberOfDigits; i > 0; i--) {
            for (int j = numberOfDigits - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = (2 * i - 1); k > 0; k--) {
                System.out.print("*");
            }

            System.out.println();
        }

        input.close();
    }
}
