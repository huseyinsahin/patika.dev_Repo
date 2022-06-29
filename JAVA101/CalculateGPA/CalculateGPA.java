import java.util.Scanner;

public class CalculateGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, physics, chemistry, turkish, history, music;

        System.out.print("Please enter your math grade : ");
        math = input.nextInt();
        
        System.out.print("Please enter your physics grade : ");
        physics = input.nextInt();

        System.out.print("Please enter your chemistry grade : ");
        chemistry = input.nextInt();
        
        System.out.print("Please enter your turkish grade : ");
        turkish = input.nextInt();

        System.out.print("Please enter your history grade : ");
        history = input.nextInt();

        System.out.print("Please enter your music grade : ");
        music = input.nextInt();

        double average;
        average = (math + physics + chemistry + turkish + history + music ) / 6;

        System.out.println(average > 60 ? "Passed the Class" : "Fail the Class");

        input.close();
    }
}
