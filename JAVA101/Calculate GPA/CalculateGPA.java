import java.util.Scanner;

public class CalculateGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, physics, chemistry, turkish, history, music, average;

        System.out.println("Please enter your math grade?");
        math = input.nextInt();
        
        System.out.println("Please enter your physics grade?");
        physics = input.nextInt();

        System.out.println("Please enter your chemistry grade?");
        chemistry = input.nextInt();
        
        System.out.println("Please enter your turkish grade?");
        turkish = input.nextInt();

        System.out.println("Please enter your history grade?");
        history = input.nextInt();

        System.out.println("Please enter your music grade?");
        music = input.nextInt();

        average = (math + physics + chemistry + turkish + history + music ) / 6;

        System.out.println(average > 60 ? "Passed the Class" : "Fail the Class");

        input.close();
    }
}
