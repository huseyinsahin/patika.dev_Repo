import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        int firstNumber, secondNumber, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number : ");
        firstNumber = input.nextInt();

        System.out.print("Please enter the second number : ");
        secondNumber = input.nextInt();
        
        System.out.print("1-Addition \n2-Subtraction \n3-Multiplication \n4-Division\n");
        System.out.print("Please make your choice? : ");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.print("Addition Result = " + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.print("Subtraction Result = " + (firstNumber - secondNumber));
                break;
            case 3:
                System.out.print("Multiplication Result = " + (firstNumber * secondNumber));
                break;
            case 4:
                if(secondNumber != 0){
                    System.out.print("Division Result = " + (firstNumber / secondNumber));
                } 
                else{
                    System.out.print("The number cannot be divided by zero!!");
                }
                break;
            default:
                System.out.print("Please enter a valid number.Try again!!");
        }

        input.close();
    }
}
