import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number N : ");
        int N = input.nextInt();

        double result = 0;
        for (int i = 1; i <= N; i++) {
            result += (1.0 / i);
        }

        System.out.println("Result : " + result);

        input.close();
    }
}
