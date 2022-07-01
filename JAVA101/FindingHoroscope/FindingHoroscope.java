import java.util.Scanner;;

public class FindingHoroscope {
    public static void main(String[] args) {
        int month, day;
        String horoscope = "";
        boolean error = false;

        Scanner input = new Scanner(System.in);

        System.out.print("What month were you born ? : ");
        month = input.nextInt();

        System.out.print("What day were you born ? : ");
        day = input.nextInt();

        if(month == 1){
            if(day >= 1 && day <= 31){
                if(day < 22){
                    horoscope = "Capricorn";
                }else{
                    horoscope = "Aquarius";
                }
            }else{
                error = true;
            }
        }

        else if(month == 2){
            if(day >= 1 && day <= 28){
                if(day < 20){
                    horoscope = "Aquarius";
                }else{
                    horoscope = "Pisces";
                }
            }else{
                error = true;
            }
        }

        else if(month == 3){
            if(day >= 1 && day <= 31){
                if(day < 21){
                    horoscope = "Pisces";
                }else{
                    horoscope = "Aries";
                }
            }else{
                error = true;
            }
        }

        else if(month == 4){
            if(day >= 1 && day <= 30){
                if(day < 21){
                    horoscope = "Aries";
                }else{
                    horoscope = "Taurus";
                }
            }else{
                error = true;
            }
        }

        else if(month == 5){
            if(day >= 1 && day <= 31){
                if(day < 22){
                    horoscope = "Taurus";
                }else{
                    horoscope = "Gemini";
                }
            }else{
                error = true;
            }
        }
        
        else if(month == 6){
            if(day >= 1 && day <= 30){
                if(day < 23){
                    horoscope = "Gemini";
                }else{
                    horoscope = "Cancer";
                }
            }else{
                error = true;
            }
        }

        else if(month == 7){
            if(day >= 1 && day <= 31){
                if(day < 23){
                    horoscope = "Cancer";
                }else{
                    horoscope = "Leo";
                }
            }else{
                error = true;
            }
        }

        else if(month == 8){
            if(day >= 1 && day <= 31){
                if(day < 23){
                    horoscope = "Leo";
                }else{
                    horoscope = "Virgo";
                }
            }else{
                error = true;
            }
        }

        else if(month == 9){
            if(day >= 1 && day <= 30){
                if(day < 23){
                    horoscope = "Virgo";
                }else{
                    horoscope = "Libra";
                }
            }else{
                error = true;
            }
        }

        else if(month == 10){
            if(day >= 1 && day <= 31){
                if(day < 23){
                    horoscope = "Libra";
                }else{
                    horoscope = "Scorpio";
                }
            }else{
                error = true;
            }
        }

        else if(month == 11){
            if(day >= 1 && day <= 30){
                if(day < 22){
                    horoscope = "Scorpio";
                }else{
                    horoscope = "Sagittarius";
                }
            }else{
                error = true;
            }
        }

        else if(month == 12){
            if(day >= 1 && day <= 31){
                if(day < 22){
                    horoscope = "Sagittarius";
                }else{
                    horoscope = "Capricorn";
                }
            }else{
                error = true;
            }
        }else{
            error = true;
        }

        if(error){
            System.out.println("You entered an incorrect value. Please try again.");
        }else{
            System.out.println("Your horoscope : " + horoscope);
        }

        input.close();
    }
}
