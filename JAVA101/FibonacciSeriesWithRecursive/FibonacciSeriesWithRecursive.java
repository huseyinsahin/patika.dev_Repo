import java.util.Scanner;

public class FibonacciSeriesWithRecursive {
    
    static int fib(int n){
        if ((n == 0) || (n == 1)) 
            return n;
        else
            return fib(n - 2) + fib(n - 1);
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int number = input.nextInt();

        System.out.println("The " + number + "th fibonacci number is: " + fib(number));
        input.close();
    }
}
