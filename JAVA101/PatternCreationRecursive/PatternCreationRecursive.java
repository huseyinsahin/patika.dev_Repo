import java.util.Scanner;

public class PatternCreationRecursive {

    static int patternSubtract(int number) {
        if (number <= 0) 
            return number;
        System.out.print(number + " ");

        return patternSubtract(number - 5);
    }

    static int patternAdd(int subtractNumber, int number ) {
        if (subtractNumber > number) 
            return subtractNumber;
        System.out.print(subtractNumber + " ");

        return patternAdd(subtractNumber + 5, number);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number N : ");
        int number = input.nextInt();
        patternAdd(patternSubtract(number),number);
        input.close();
    }
}
