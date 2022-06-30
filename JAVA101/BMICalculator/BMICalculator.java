import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        
        double height, weight, bmi;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your height (in meters) : ");
        height = sc.nextDouble();

        System.out.print("Please enter your weight : ");
        weight = sc.nextDouble();

        bmi = weight / (height * height);

        System.out.print("Your Body Mass Index : " + bmi);
        
        sc.close();

    }
}
