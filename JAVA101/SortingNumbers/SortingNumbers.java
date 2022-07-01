import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {

        int firstNumber, secondNumber, thirdNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number : ");
        firstNumber = input.nextInt();

        System.out.print("Please enter second number : ");
        secondNumber = input.nextInt();

        System.out.print("Please enter third number : ");
        thirdNumber = input.nextInt();

        if((firstNumber == secondNumber) || (firstNumber == thirdNumber) || (secondNumber == thirdNumber)){
            System.out.println("Numbers Shouldn't Be Equal to Each Other!!");
        }
        else if(firstNumber < secondNumber && firstNumber < thirdNumber){
            if(secondNumber < thirdNumber){
                System.out.println(firstNumber + " < " + secondNumber + " < " + thirdNumber);
            }
            else{
                System.out.println(firstNumber + " < " + thirdNumber + " < " + secondNumber);
            }
        }else if(secondNumber < firstNumber && secondNumber < thirdNumber){
            if(firstNumber < thirdNumber){
                System.out.println(secondNumber + " < " + firstNumber + " < " + thirdNumber);
            }
            else{
                System.out.println(secondNumber + " < " + thirdNumber + " < " + firstNumber);
            }
        }else{
            if(firstNumber < secondNumber){
                System.out.println(thirdNumber + " < " + firstNumber + " < " + secondNumber);
            }
            else{
                System.out.println(thirdNumber + " < " + secondNumber + " < " + firstNumber);
            }
        }

        input.close();
        
    }
}
