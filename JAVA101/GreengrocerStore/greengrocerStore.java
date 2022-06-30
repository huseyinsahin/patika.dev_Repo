import java.util.Scanner;

public class greengrocerStore {
    public static void main(String[] args) {
        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, aubergine = 5.00;
        double pearKG, appleKG, tomatoKG, bananaKG, aubergineKG, amount;

        Scanner sc = new Scanner(System.in);

        System.out.print("How many kilograms of pears ? : ");
        pearKG = sc.nextDouble();
        System.out.print("How many kilograms of apples ? : ");
        appleKG = sc.nextDouble();
        System.out.print("How many kilograms of tomatos ? : ");
        tomatoKG = sc.nextDouble();
        System.out.print("How many kilograms of bananas ? : ");
        bananaKG = sc.nextDouble();
        System.out.print("How many kilograms of aubergines ? : ");
        aubergineKG = sc.nextDouble();

        amount = (pear * pearKG) + (apple * appleKG) + (tomato * tomatoKG) + (banana * bananaKG) + (aubergine * aubergineKG);

        System.out.print("Total amount : " + amount + " TL");

        sc.close();
    }
}
