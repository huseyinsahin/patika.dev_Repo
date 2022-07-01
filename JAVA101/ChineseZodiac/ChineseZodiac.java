import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        
        int yearOfBirth, remainder;
        String zodiacSign = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your year of birth : ");
        yearOfBirth = input.nextInt();

        remainder = yearOfBirth % 12;

        switch(remainder){
            case 0:
                zodiacSign = "Monkey";
                break;
            case 1:
                zodiacSign = "Rooster";
                break;
            case 2:
                zodiacSign = "Dog";
                break;
            case 3:
                zodiacSign = "Pig";
                break;
            case 4:
                zodiacSign = "Mouse";
                break;
            case 5:
                zodiacSign = "Bull";
                break;
            case 6:
                zodiacSign = "Tiger";
                break;
            case 7:
                zodiacSign = "Rabbit";
                break;
            case 8:
                zodiacSign = "Dragon";
                break;
            case 9:
                zodiacSign = "Snake";
                break;
            case 10:
                zodiacSign = "Horse";
                break;
            case 11:
                zodiacSign = "Sheep";
                break;
            default:
        }
        System.out.println("Your Chinese Zodiac Sign : " + zodiacSign);

        input.close();
    }
}
