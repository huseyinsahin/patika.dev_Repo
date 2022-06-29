import java.util.Scanner;

public class CalculateVAT {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double amount, vatRate, vatAmount, amountWithVAT;
        boolean vatStatus;

        System.out.print("Please enter your amount : ");
        amount = input.nextDouble();

        vatStatus = (0 <= amount) && (amount <= 1000);
        vatRate = vatStatus ? 0.18d : 0.08d;

        vatAmount = amount * vatRate;
        amountWithVAT = amount + vatAmount;

        System.out.println("VAT-Free Amount : " + amount);
        System.out.println("VAT Rate : " + vatRate);
        System.out.println("VAT Amount : " + vatAmount);
        System.out.println("Amount with VAT : " + amountWithVAT);

        input.close();
    }
}
