import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Please enter your guess : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a value between 0-100.");
                if (isWrong) {
                    right++;
                    System.out.println("You made too many incorrect entries. Remaining right : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Your next wrong entry will be deducted from your rights.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations, correct guess! Your guessed number : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("You entered an incorrect number!");
                if (selected > number) {
                    System.out.println(selected + " is greater than the hidden number.");
                } else {
                    System.out.println(selected + " is less than the hidden number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining Right : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost! ");
            if (!isWrong) {
                System.out.println("Your guesses : " + Arrays.toString(wrong));
            }
        }
    }
}
