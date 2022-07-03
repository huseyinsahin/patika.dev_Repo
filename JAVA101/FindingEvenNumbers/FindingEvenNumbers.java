import java.util.Scanner;

public class FindingEvenNumbers {
    public static void main(String[] args) {

        int number, counter = 0;
    
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        number = input.nextInt();
        
        /* The part that finds even numbers up to the number entered by the user. */

        while(counter <= number){
            if(counter % 2 == 0){
                System.out.print(counter + " ");
            }
            counter++;
        }
        
        System.out.println("\n*******************************************************************");

        double total = 0, average;

        /* The part that calculates the average of the numbers exactly 
        divided by 3 and 4 from the numbers from 0 to the entered number */

        for (int i = 0; i <= number ; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                System.out.println("Divisible by 3 and 4 : " + i);
                total += i;
                counter++;
            }
        }

        System.out.println("Total : " + total);
        average = total / counter;
        System.out.println("Averaage : " + average);

        input.close();
    }
}

