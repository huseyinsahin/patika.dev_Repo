import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distanceTraveled, taximeterAmount, amount;
        double openingFee = 10.0, holdsPerKM = 2.20, minAmount = 20.0;

        System.out.print("Please write the distance traveled : ");
        distanceTraveled = input.nextDouble();

        amount = distanceTraveled * holdsPerKM;
        taximeterAmount = (amount >= 20) ? (amount + openingFee) : (minAmount)12;

        System.out.print("Taximeter Amount : " + taximeterAmount);

        input.close();
    }
}
