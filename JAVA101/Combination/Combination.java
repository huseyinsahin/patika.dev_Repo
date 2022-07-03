import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {

        int n, r, nFact = 1, rFact = 1, n_rFact = 1;
        double combination;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number n : ");
        n = input.nextInt();

        System.out.print("Please enter the number r : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            nFact *= i;
        }

        for (int i = 1; i <= r; i++) {
            rFact *= i;
        }

        int nDiffr = n - r;
        for (int i = 1; i <= nDiffr; i++) {
            n_rFact *= i;
        }

        //C(n,r) = n! / (r! * (n-r)!)
        combination = nFact / ( rFact * n_rFact );
        System.out.println("n = " + n + " r = " + r + " while combination : " + combination);

        input.close();
        
    }
}
