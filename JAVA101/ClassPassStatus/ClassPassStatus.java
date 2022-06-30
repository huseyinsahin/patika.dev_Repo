import java.util.Scanner;

public class ClassPassStatus {
    public static void main(String[] args) {

        int math, physics, turkish, chemistry, music;
        int total = 0, counter = 0; 

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your math grade : ");
        math = input.nextInt();
        if(0 <= math && math <= 100){
            total += math;
            counter++;
        }else{
            System.out.println("Invalid value.");
        }

        System.out.print("Please enter your physics grade : ");
        physics = input.nextInt();
        if(0 <= physics && physics <= 100){
            total += physics;
            counter++;
        }else{
            System.out.println("Invalid value.");
        }

        System.out.print("Please enter your turkish grade : ");
        turkish = input.nextInt();
        if(0 <= turkish && turkish <= 100){
            total += turkish;
            counter++;
        }else{
            System.out.println("Invalid value.");
        }

        System.out.print("Please enter your chemistry grade : ");
        chemistry = input.nextInt();
        if(0 <= chemistry && chemistry <= 100){
            total += chemistry;
            counter++;
        }else{
            System.out.println("Invalid value.");
        }

        System.out.print("Please enter your music grade : ");
        music = input.nextInt();
        if(0 <= music && music <= 100){
            total += music;
            counter++;
        }else{
            System.out.println("Invalid value.");
        }

        double gradeAverage = total / counter;
        System.out.print("Grade average : " + gradeAverage);

        if(gradeAverage > 55){
            System.out.print(" ==> Pass the class.");
        }else{
            System.out.print(" ==> Fail the class.");
        }

        input.close();
    }
}
