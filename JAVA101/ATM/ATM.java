import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        
        String userName, passWord;
        int select, price;
        int right = 3, balance = 5000;

        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Please enter username : ");
            userName = input.nextLine();

            System.out.print("Please enter password : ");
            passWord = input.nextLine();

            if(userName.equals("huseyin") && passWord.equals("sahin333")){
                System.out.println("Hello. Welcome to Kodluyoruz Bank.");
                do {
                    System.out.println("1 - Deposit\n" +
                                   "2 - Withdraw\n" +
                                   "3 - Check Balance\n" +
                                   "4 - EXIT");
                    System.out.print("Please select the action you want to do : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("The amount of money you want to deposit : ");
                            price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("The amount of money you want to withdraw : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price;
                            }
                            break;

                        case 3:
                            System.out.println("Your balance : " + balance);
                            break;

                        default:
                            System.out.println("You entered an incorrect value.");
                            break;
                    }
                } while (select != 4);
                System.out.println("See you again.");

            }else{
                
                right--;
                System.out.println("Incorrect user or password. Try again.");

                if(right == 0){
                    System.out.println("Your account has been blocked. Please contact the bank.");
                }else{
                    System.out.println("Your remaining right : " + right);
                }
            }
        }
        
        input.close();
    }
}
