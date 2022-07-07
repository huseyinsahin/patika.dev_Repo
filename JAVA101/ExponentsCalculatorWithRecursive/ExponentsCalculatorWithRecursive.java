import java.util.Scanner;

public class ExponentsCalculatorWithRecursive {
    
    static int exponentsCalculator(int base, int exponent){

        if(exponent == 0){
            return 1;
        }else{
            return (base * exponentsCalculator(base, exponent - 1));
        }
        
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number : ");
        int base = input.nextInt();
        System.out.print("Enter the exponent number : ");
        int exponent = input.nextInt();

        System.out.println("Result : "+ exponentsCalculator(base, exponent));
        input.close();
    }
}
