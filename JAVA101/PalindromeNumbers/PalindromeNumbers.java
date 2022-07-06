import java.util.Scanner;

public class PalindromeNumbers {

    static boolean isPalindrome(int number){
        int temp = number, lastNumber, reversNumber = 0;
        
        while (temp != 0) {
            lastNumber = temp % 10;
            reversNumber = (reversNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reversNumber){
            System.out.println(number + " palindromes is a number.");
            return true;
        }else{
            System.out.println(number + " palindromes is not a number.");
            return false;
        }
        
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a number : ");
        int n = input.nextInt();

        isPalindrome(n);
        
        input.close();

    }
}
