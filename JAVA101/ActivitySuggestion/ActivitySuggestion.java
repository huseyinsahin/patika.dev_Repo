import java.util.Scanner;

public class ActivitySuggestion {
    public static void main(String[] args) {

        int temperature;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the temperature value : ");
        temperature = input.nextInt();

        String suggestion = (temperature < 5) ? "You Can Ski."
                : ((5 <= temperature && temperature < 15) ? "You can go to the cinema."
                        : ((15 <= temperature && temperature <= 25) ? "You can go on a picnic."
                                : "You can go swimming."));

        System.out.println(suggestion);

        input.close();
    }
}
