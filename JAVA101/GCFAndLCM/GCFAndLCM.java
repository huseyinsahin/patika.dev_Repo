import java.util.Scanner;

public class GCFAndLCM {
    public static void main(String[] args) {
        
        int firstNumber, secondNumber, smallNumber;
        int GCF = 1, LCM = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number : ");
        firstNumber = input.nextInt();

        System.out.print("Please enter second number : ");
        secondNumber = input.nextInt();

        if(firstNumber < secondNumber){
            smallNumber = firstNumber;
        }else{
            smallNumber = secondNumber;
        }

        int i = smallNumber;
        while (i >= 1) {
            if(firstNumber % i == 0 && secondNumber % i == 0){
                GCF = i;
                System.out.println("GCF = " + GCF);
                break;
            }
            i--;
        }

        int j = 1;
        while (j <= (firstNumber * secondNumber)) {
            if(j % firstNumber == 0 && j % secondNumber == 0){
                LCM = j;
                System.out.println("LCM = " + LCM);
                break;
            }
            j++;
        }
        
        input.close();
    }
}
