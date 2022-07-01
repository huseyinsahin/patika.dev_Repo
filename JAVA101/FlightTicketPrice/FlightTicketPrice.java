import java.util.Scanner;

public class FlightTicketPrice {
    public static void main(String[] args) {

        double distance, ticketAmount = 0, feePerDistance = 0.10;
        int age, travelType;
        Boolean control = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in km : ");
        distance = input.nextDouble();

        System.out.print("Enter your age : ");
        age = input.nextInt();

        System.out.print("Enter trip type (1 => One Way , 2 => Round Trip ) : ");
        travelType = input.nextInt();

        ticketAmount = distance * feePerDistance;

        switch(travelType){
            case 1 :
                ticketAmount = ticketAmount;
                break;
            case 2 :
                ticketAmount *= 2 * 0.8;
                break;
            default:
                control = true;
        }

        if(!control){
            if(0 < age && age < 12){
                ticketAmount *= 0.5;
                System.out.println("Your ticket price : " + ticketAmount);
            }else if(12 <= age && age < 24){
                ticketAmount *= 0.9;
                System.out.println("Your ticket price : " + ticketAmount);
            }else if(24 <= age && age <= 65){
                ticketAmount = ticketAmount;
                System.out.println("Your ticket price : " + ticketAmount);
            }else if(65 > age){
                ticketAmount *= 0.7;
                System.out.println("Your ticket price : " + ticketAmount);
            }else{
                System.out.println("You entered an incorrect age!!!");
            }
        }else{
            System.out.println("You entered an incorrect travel type!!!");
        }

        input.close();
    }
}
