import java.util.Scanner;

public class ExponentsCalculator {
    public static void main(String[] args) {

        int base, exponent;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter base number : ");
        base = input.nextInt();

        System.out.print("Please enter exponent number : ");
        exponent = input.nextInt();

        int total = 1;
        for (int i = 1; i <= exponent; i++) {
            total *= base;
        }

        System.out.println(base + " ^ " + exponent + " : " + total);

        input.close();
    }
}
